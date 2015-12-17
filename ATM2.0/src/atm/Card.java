package atm;

public class Card {
	
	int Pin;
	int CardNo;
	
	public int getPin(){
		return Pin;
	}
	
	public int getCardNo(){
		return CardNo;
	}
	
	Card(int pin,int cardno){
		Pin=pin;
		CardNo=cardno;
	}

}
