package Mediator;


import java.util.*;

public class Saito implements LoveMediator{ 

    private Map<String,Colleague> colleagueMap = new HashMap<String,Colleague>(); 

    public void addColleague(Colleague colleague){ 

        colleagueMap.put(colleague.getName(),colleague); 

    } 

    public int consultation(Colleague colleagueInLove,Colleague secretLover) { 

        int possibility= 0; 

        /* さまざまな状況を考慮して、possibility を導出 */

     if(colleagueInLove.getName().equals("新田") && secretLover.getName().equals("女１")){
    	 possibility = 80;
       }


        return possibility; 

    }

	private void If(boolean b) {
		// TODO Auto-generated method stub
		
	} 

}
