package Mediator;

import Mediator.Colleague;
import Mediator.LoveMediator;
import Mediator.Saito;


public class Woman1 implements Colleague{ 

    private String name = "èóÇP";

    private int tension; 

    private Colleague secretLover = null; 

    private LoveMediator mediator = new Saito(); 

     

    public String getName(){

        return name;

    }

    public  void setSecretLover(Colleague colleague){ 

        this.secretLover = colleague; 

    } 

    public void needsAdvice(){ 

        this.tension = mediator.consultation(this,secretLover); 

    } 

}
