import java.util.ArrayList;

public class Branch {
	private String branchName;
	private ArrayList<Customer> customerList = new ArrayList<Customer>();
	private Customer customer;
	
	//constructor with branch name
	public Branch(String branchName) {
		super();
		this.branchName = branchName;
	}

	//add a new customer & initial transaction
	public void addCustomer(String customerName, double initialTransaction){
		customer = new Customer(customerName);
		customer.addTransaction(initialTransaction);
		customerList.add(customer);
		System.out.println("New customer is successfully added: " + customerName + ", initial transaction: " + initialTransaction);
	}
	
	//find existing customer
	public int searchCustomer(String customerName){
		for(int i = 0; i < customerList.size(); i++){
			Customer tempt_customer = customerList.get(i);
			String tempt_customer_name = tempt_customer.getCustomerName();
			if(tempt_customer_name.equals(customerName))
				return i;
		}
		return -1;
	}
	
	//add additional transactions for existing customer
	public void addTransactionToCustomer(String searchCustomer, double newTransaction){
		int index = searchCustomer(searchCustomer);
		if(index != -1){
			customerList.get(index).addTransaction(newTransaction);
			System.out.println("Customer " + searchCustomer + " adds new transaction: " + newTransaction);
		}
		else{
			System.out.println("Customer " + searchCustomer + " is not found");
		}
	}
	
	//list of customers of the branch
	public void getCustomerList(boolean showTransaction){
		System.out.println("Bank " + this.branchName + " has " + customerList.size() + " customers: ");
		for(int i = 0; i < customerList.size(); i++){
			System.out.println((i + 1) + ": " + customerList.get(i));
			if(showTransaction){
				customerList.get(i).getTransactionList();
			}
		}
	}

	//should return branchName to compare if existed
	public String getBranchName() {
		return branchName;
	}
	
	
	
}
