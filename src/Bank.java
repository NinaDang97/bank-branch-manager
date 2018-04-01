import java.util.*;

public class Bank {
	private Scanner s = new Scanner(System.in);
	private ArrayList<Branch> branchList = new ArrayList<Branch>();
	private Branch branch;
	
	//add a new branch
	public void addNewBranch(String newBranchName){
		int index = searchBranch(newBranchName);
		if(index == -1){
			branch = new Branch(newBranchName);
			branchList.add(branch);
			System.out.println("New branch " + newBranchName + " successfully added");
		}
		else{
			System.out.println(newBranchName + " is already existing. Choose another name");
		}
	}
	
	//search particular branch in branchList
	public int searchBranch(String branchName){
		for(int i = 0; i < branchList.size(); i++){
			Branch tempt_branch = branchList.get(i);
			String tempt_branch_name = tempt_branch.getBranchName();
			if(tempt_branch_name.equals(branchName))
				return i;
		}
		return -1;
	}
	
	//add a new customer to that branch with initial transaction
	//find branch 
	public void addNewCustomerToBranch(String searchBranch){
		int index = searchBranch(searchBranch);
		if(index != -1){
//			System.out.println("Add new customer name: ");
//			String customerName = s.nextLine();
//			System.out.println("Enter initial transaction: ");
//			double initialTransaction = s.nextDouble();
//			s.nextLine();
			branchList.get(index).addCustomer("Tim", 6000);
			branchList.get(index).addCustomer("Maria", 1000);
		}
		else{
			System.out.println(searchBranch + " cannot be found.");
		}
	}
	
	//add a transaction of an existing customer for the branch
	public void addTransactionToCustomerAndBranch(String searchBranch){
		int indexBranch = searchBranch(searchBranch);
		if(indexBranch != -1){
			System.out.println("Enter customer name: ");
			String customerName = s.nextLine();
			System.out.println("Add new transaction: ");
			double newTransaction = s.nextDouble();
			s.nextLine();
			//Find existing customer of the branch
			branchList.get(indexBranch).addTransactionToCustomer(customerName, newTransaction);
		}
		else{
			System.out.println(searchBranch + " cannot be found.");
		}
	}
	
	//show a list of customers for a specific branch
	//[optional] list of their transactions
	public void showAllCustomerOfBranch(String searchBranch, boolean showTransaction){
		int indexBranch = searchBranch(searchBranch);
		if(indexBranch != -1){
			branchList.get(indexBranch).getCustomerList(showTransaction);
		}
		else{
			System.out.println(searchBranch + " cannot be found.");
		}
	}
	
}
