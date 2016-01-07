
public class Manifold {

	boolean fuel;
	boolean turbo;
	
	public Manifold(boolean fuel, boolean turbo) {
		// TODO Auto-generated constructor stub
	this.fuel=fuel;
	this.turbo=turbo;
	}
	
	
	
	
	public int manifoldprice(){
		if(fuel==true && turbo==true){
			return 50000;
		}
		else if(fuel==true && turbo!=true){
			return 40000;
		}
		else if(!fuel && turbo){
			return 30000;
		}
		else{
			return 20000;

		}
		
		
		
	}

}
