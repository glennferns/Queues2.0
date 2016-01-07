
public class Car {
	
	int total;
	Chasis mychasis;
	FrontTires myfronttires;
	BackTires mybacktires;	
	Engine myengine;
	Windows mywindows;
	Seats myseats;
	Door mydoor;
	
	
	Car(String chasistype,int chasisprice,int ftiresize,int ftireprice,int btiresize,int btireprice,int gears,int horsepower,int price,boolean fuel,
			boolean turbo,String wintype,boolean tint,int winprice,String seatmat,int seatnum,int matprice,String doortype,int doorprice,int doornum){
	
	mychasis=new Chasis(chasistype,chasisprice);
	myfronttires=new FrontTires(ftiresize,ftireprice);
	mybacktires=new BackTires(btiresize,btireprice);	
	myengine=new Engine(gears,horsepower,price,fuel,turbo);
	mywindows=new Windows(wintype,tint,winprice);
	myseats=new Seats(seatmat,seatnum,matprice);
	mydoor=new Door(doortype,doorprice,doornum);
	
	
	}
	
	
	
	
	public int CarPrice(){
		System.out.println("Chasis price for "+mychasis.type+":"+mychasis.ChasisPrice());
		System.out.println("Front Tire price for"+myfronttires.size+" inch :"+myfronttires.tireprice());
		System.out.println("Back Tire price for"+mybacktires.size+" inch:"+mybacktires.tireprice());
		System.out.println("Engine price(incl manifold price):"+myengine.engineprice());
		System.out.println("Windows price:"+mywindows.windowsprice());
		System.out.println("Seats price for "+myseats.number+" "+myseats.material+" seats:"+myseats.seatsprice());
		System.out.println("Door price for "+mydoor.type+" door:"+mydoor.doorprice());
		
		
		
		total=mychasis.ChasisPrice()+myfronttires.tireprice()+mybacktires.tireprice()+myengine.engineprice()+mywindows.windowsprice()+myseats.seatsprice()+mydoor.doorprice();
		return total;
	}
	

}
