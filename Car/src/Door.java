
public class Door {
	
	String type;
	int price;
	int number;
	
	Door(String type,int price,int number){
		this.type=type;
		this.price=price;
		this.number=number;
	}
	
	public int doorprice(){
		return price*number;
	}

}
