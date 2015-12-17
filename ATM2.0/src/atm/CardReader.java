package atm;

public class CardReader {

	int Pin;
	
	public int checkPin(int pin){
		if(Pin==pin){
			return 1;
		}
		else
		{
			return 0;
		}
	}
	

	public int getPin(){
		return Pin;
	}
	
	
	
	
	CardReader(int pin){
		Pin=pin;
	}
	
	
}
