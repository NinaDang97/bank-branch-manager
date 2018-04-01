import java.util.ArrayList;

public class Customer {
	private String customerName;
	private ArrayList<Double> transactionList = new ArrayList<Double>();

	//constructor with customer name
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	
	//getter customerName
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void getTransactionList() {
		System.out.println("Customer " + this.customerName + ": " + transactionList.size() + " transactions have been made.");
		for(int i = 0; i < transactionList.size(); i++){
			System.out.println((i + 1) + "# " + transactionList.get(i));
		}
	}
	public void addTransaction(double transaction) {
		this.transactionList.add(Double.valueOf(transaction));
	}
	
}
