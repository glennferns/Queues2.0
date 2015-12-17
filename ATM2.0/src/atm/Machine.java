package atm;

public class Machine {

	Display display;
	int Total;
	int Thousand;
	int FiveHundred;
	int Hundred;
	int Ten;
	
	
	public void dispense(int amt ){
		int rem=amt;
		int den=0;
		int temp=0;
		
		
		temp=rem/1000;
		if(rem>=1000 && temp<=Thousand){
		den=rem/1000;	
		rem=rem%1000;
		Thousand=Thousand-den;
		display.print("1000 X "+den);
		}
		
		temp=rem/500;
		if(rem>=500 && temp<=FiveHundred){
		den=rem/500;
		rem=rem%500;
		FiveHundred=FiveHundred-den;
		display.print("500 X "+den);
		}
		
		temp=rem/100;
		if(rem>=100 && temp<=Hundred){
		den=rem/100;
		rem=rem%100;
		Hundred=Hundred-den;
		display.print("100 X "+den);
		}
		
		temp=rem/10;
		if(rem>=10 && temp<=Ten){
		den=rem/10;
		rem=rem%10;
		Ten=Ten-den;
		display.print("10 X "+den);	
		}

		Total=Total-amt;
	}
	
	public int check_balance(){
		return Total;	
		
	}

	public Machine(int total, int thousand, int fiveHundred, int hundred, int ten,Display display) {
		this.Total = total;
		this.Thousand = thousand;
		this.FiveHundred = fiveHundred;
		this.Hundred = hundred;
		this.Ten = ten;
		this.display=display;
	}
	
	
	public void check_den(){
		display.print("1000 X "+Thousand);
		display.print("500 X "+FiveHundred);
		display.print("100 X "+Hundred);
		display.print("10 X "+Ten);
	}

	
	
	
	
	
}
