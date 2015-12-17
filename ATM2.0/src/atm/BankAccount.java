package atm;

public class BankAccount {
	int Pin;
	int Cardno;
	String AccNo;
	float Balance;
	
	BankAccount(int pin,int cardno,String accno,float balance){
	Pin=pin;
	Cardno=cardno;
	AccNo=accno;
	Balance=balance;
	}
	
	
	
	public int getPin(int cardno){
		if(Cardno==cardno){
		return Pin;
		}
		else{
			return -1;
		}
	}
	
	
	public String getAccno(int cardno){
		return AccNo;
		
	}
	

	public float getBalance(){
		return Balance;
		
	}
	
	public void setBalance(float amt){
		Balance=amt;
		
	}
	
	public int getPin(){
		return Pin;
		
	}
	
	public int getCardno(){
		return Cardno;
		
	}
	public String getAccno(){
		return AccNo;
		
	}
	
	
	public int getCardNo(int cardno){
		if(Cardno==cardno){
			return 1;
		}
		else{
			return 0;
		}
		
	}
	
	public int withdraw(int amt){
		if(Balance>amt){
		Balance=Balance-amt;
		
		return 1;
		}
		else
		{
			return -1;
		}
	}
	public float checkbalance(){
		return Balance;
	}
	
	
	
	
	
}
