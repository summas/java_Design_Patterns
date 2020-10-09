package Decorator;

public class SliceAlmondToppingIcecream implements Icecream{

    private Icecream ice = null;

    public SliceAlmondToppingIcecream(Icecream ice){

        this.ice = ice;

    }

    public String getName(){

        String name = "シリコンアーモンド";

        name += ice.getName();

        return name;

    }

    public String howSweet(){

        return ice.howSweet();

    }

} 
