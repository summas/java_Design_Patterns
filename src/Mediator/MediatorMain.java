package Mediator;

public class MediatorMain {

	  public static void main(String[] args) {
		  Nitta nitta = new Nitta();
		  Woman1 w1 = new Woman1();
		  Saito test = new Saito();
		  test.addColleague(nitta);
		  test.addColleague( w1);
		  
		 
		  nitta.setSecretLover(w1);
		  nitta.needsAdvice();
		 int result = 0; 
		 result = test.consultation(nitta, w1);
		  
		 System.out.println(result + "%Ç≈Ç∑ÅB");
	  }
}
