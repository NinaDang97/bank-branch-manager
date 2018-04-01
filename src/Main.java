
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Khanh-Bank");
		Bank newBank = new Bank();
		//add new branch
		newBank.addNewBranch("Saigon-Tan Phu");
		newBank.addNewBranch("Helsinki-Pasila");
		newBank.addNewBranch("Helsinki-Malminkartano");
		newBank.addNewBranch("Saigon-Tan Phu"); //remove cuz duplication
		
		//add new customer + initial transaction to specific branch
		newBank.addNewCustomerToBranch("Saigon-Tan Phu");
		newBank.addTransactionToCustomerAndBranch("Saigon-Tan Phu");
		
		//show a list of customers for a specific branch
		//[optional] list of their transactions
		newBank.showAllCustomerOfBranch("Saigon-Tan Phu", true);
		
		//To be continued with user input
		//
		//
		//
	}
}
