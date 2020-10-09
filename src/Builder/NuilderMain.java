package Builder;

public class NuilderMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

Builder builder = new SaltWaterBuilder(); 

Director dir = new Director( builder ); 

dir.constract(); 

SaltWater saltWater = (SaltWater)builder.getResult();
		
	}

}
