package atm;

public class Client {
	
	
	public static void main(String[] args){
		Controller controller=new Controller();
		Display display=new Display();
		BankAccount bankaccount=new BankAccount(1234,123456,"987654321",15000);
		Machine machine=new Machine(20000,10,8,40,200,display);
		
		//working transaction
		controller.transaction(1234,123456, 5650,bankaccount,machine,display);
		System.out.println("                             ");
		
		//incorrect pin
		controller.transaction(123,123456, 4780,bankaccount,machine,display);
		System.out.println("                             ");
		
		//incorrect card no
		controller.transaction(1234,23456, 4780,bankaccount,machine,display);
		System.out.println("                             ");
		
		//working transaction
		controller.transaction(1234,123456, 5000,bankaccount,machine,display);
		System.out.println("                             ");
		
		//insufficient balance in machine
		controller.transaction(1234,123456, 15000,bankaccount,machine,display);
		System.out.println("                             ");
		
		//insufficient balance in account
		controller.transaction(1234,123456, 7000,bankaccount,machine,display);
		
	}

}



