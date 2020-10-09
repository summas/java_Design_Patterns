package Decorator;

public class DecoMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1= null;
		String name2= null;
		String name3= null;
		
		String sweet1 = null;
		String sweet2= null;
		String sweet3= null;
				
		Icecream ice1 = new GreenTeaIcecream();

		Icecream ice2 = new CashewNutsToppingIcecream(new VanillaIcecream());
		
		Icecream ice3 = new SliceAlmondToppingIcecream(new CashewNutsToppingIcecream(new GreenTeaIcecream()));

		name1 = ice1.getName();
		name2 = ice2.getName();
		name3 = ice3.getName();
	
		sweet1 = ice1.howSweet();
		sweet2 = ice2.howSweet();
		sweet3 = ice3.howSweet();
		
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		System.out.println(sweet1);
		System.out.println(sweet2);
		System.out.println(sweet3);
		

	}

}
