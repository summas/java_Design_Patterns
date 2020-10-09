package Flyweight;

public class Flymain {


	    /**
	     * 人文字を作成するメイン関数
	     * @param args
	     */

	 public static void main(String args[]) {
		 
		 HumanLetterFactory factory = new  HumanLetterFactory();

		  HumanLetter あ = factory.getHumanLetter("あ");

	        takeAPhoto(あ);

	        HumanLetter い  = factory.getHumanLetter("い");
	        
	        takeAPhoto(い);

	
	        HumanLetter は  = factory.getHumanLetter("は");
	        takeAPhoto(は);

	        takeAPhoto(あ);

	        takeAPhoto(い);


	        HumanLetter よ  = factory.getHumanLetter("よ");
	        takeAPhoto(よ);


	        HumanLetter り  = factory.getHumanLetter("り");
	        takeAPhoto(り);

	
	        HumanLetter も  = factory.getHumanLetter("も");
	        takeAPhoto(も);

	        takeAPhoto(あ);

	        HumanLetter お  = factory.getHumanLetter("お");
	        takeAPhoto(お);

	        takeAPhoto(い);
		  
		  
		  
		  
		  
		  
	  /**      HumanLetter あ = new HumanLetter("あ");

	        takeAPhoto(あ);

	        HumanLetter い = new HumanLetter("い");

	        takeAPhoto(い);

	        HumanLetter は = new HumanLetter("は");

	        takeAPhoto(は);

	        takeAPhoto(あ);

	        takeAPhoto(い);

	        HumanLetter よ = new HumanLetter("よ");

	        takeAPhoto(よ);

	        HumanLetter り = new HumanLetter("り");

	        takeAPhoto(り);

	        HumanLetter も = new HumanLetter("も");

	        takeAPhoto(も);

	        takeAPhoto(あ);

	        HumanLetter お = new HumanLetter("お");

	        takeAPhoto(お);

	        takeAPhoto(い);
**/
		  
		  
		  
		  
		  
		  
	    }

	    /**

	     * 写真を撮るメソッド

	     * @param letter

	     */
	
	 
	    private static void takeAPhoto(HumanLetter letter) {

	        System.out.println(letter.getLetter());
	        
	   // System.out.println(factory.getHumanLetter(letter));
	    }
}

