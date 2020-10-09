package State;

public class Mikkochan {

	 public static void main(String args[]) {
		 
		 String morning = null;
		 String cold = null;
		 
	//	 State BadMoodState = BadMoodState;
		 StatePatternYumichan yumistate = new StatePatternYumichan();
		 
		 
		 yumistate.kibun();
		 
		 
		 morning = yumistate.morningGreet();
		 
		 cold = yumistate.getProtectionForCold();
		 
		 System.out.println(morning);
		 System.out.println(cold);
		 
	 }	
}
