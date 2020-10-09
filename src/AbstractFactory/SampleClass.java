package AbstractFactory;


import java.util.*;

 

public class SampleClass{ 

    public static void main(String args[]){ 

        HotPot hotPot = new HotPot(new Pot()); 

        hotPot.addSoup(new ChickenBonesSoup()); // Œ{‚ª‚ç‚ğÏ‚ñ‚¾ƒX[ƒv 

        hotPot.addMain(new Chicken());        // Main ‚Æ‚µ‚ÄŒ{“÷ 

        List<Vegetable> vegetables = new ArrayList<Vegetable>(); 

        vegetables.add(new ChineseCabbage()); // ”’Ø 

        vegetables.add(new Leek());           // ‚Ë‚¬ 

        vegetables.add(new Chrysanthemum());  // t‹e 

        hotPot.addVegetables(vegetables);

        List<Ingredients> otherIngredients = new ArrayList<Ingredients>(); 

        otherIngredients.add(new Tofu());     // “¤•… 

        hotPot.addOtherIngredients(otherIngredients);

    } 

}