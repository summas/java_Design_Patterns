package Prototype;


public class Teacher{

	public Paper[] createManyCrystals(){

        Paper prototype = new Paper("ê·ÇÃåãèª");

        drawCrystal(prototype);

        cutAccordanceWithLine(prototype);

        Paper[] papers = new Paper[100];

        for(int n=0; n<papers.length ; n++){

            papers[n] = (Paper)prototype.createClone();

        }

        return papers;

    }

    private void drawCrystal(Paper paper){

        // ï`Ç¢ÇΩÇËè¡ÇµÇΩÇËÇµÇ»Ç™ÇÁÅAÇ´ÇÍÇ¢Ç…ï`Ç≠ÇΩÇﬂéûä‘Ç™Ç©Ç©ÇÈ

    }

    private void cutAccordanceWithLine(Paper paper){

        // ï`Ç©ÇÍÇΩê¸Ç…âàÇ¡ÇƒÇ´ÇÍÇ¢Ç…êÿÇÈÇ…ÇÕéûä‘Ç™Ç©Ç©ÇÈ

    }

}