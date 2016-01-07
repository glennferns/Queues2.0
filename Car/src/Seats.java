
public class Seats {
	
	String material;
	int number;
	int materialprice;



Seats(String material,int number,int materialprice){
	this.material=material;
	this.number=number;
	this.materialprice=materialprice;
}

//assuming 5 meters needed for a single seat
public int seatsprice(){
	return (materialprice*5)*number;
}


}
