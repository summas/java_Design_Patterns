package Mediator;


public class Nitta implements Colleague{ 

    private String name = "êVìc";

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
