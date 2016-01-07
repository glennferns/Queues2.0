
public class Engine {
	int gears;
	int horsepower;
	int price;
	boolean fuel;
	boolean turbo;
	Manifold mymanifold;
	
	
	Engine(int gears,int horsepower,int price,boolean fuel,boolean turbo){
	this.gears=gears;
	this.horsepower=horsepower;
	this.price=price;
	this.fuel=fuel;
	this.turbo=turbo;
	mymanifold=new Manifold(this.fuel,this.turbo);
}
	
	
	
	
	
	public int engineprice(){
		
		
		return price+mymanifold.manifoldprice();
	}
	
}
