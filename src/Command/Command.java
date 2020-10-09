package Command;

public abstract class Command { 

    //ビーカー 

    protected Beaker beaker; 

    //ビーカーをセットするメソッド 

    public void setBeaker(Beaker beaker) {

         this.beaker = beaker; 

    } 

    //要求内容を実行する抽象メソッド 

    public abstract void execute(); 

} 