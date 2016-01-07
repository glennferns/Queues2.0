
public class Windows {
	
	String type;
	boolean tint;
	int price;
	
	Windows(String type,boolean tint,int price){
		this.type=type;
		this.tint=tint;
		this.price=price;
	}
	
	public int windowsprice(){
		return price*4;
	}

}
