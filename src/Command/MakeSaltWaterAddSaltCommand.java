package Command;


import java.util.*;

 

//実験コマンドクラス 

public class MakeSaltWaterAddSaltCommand extends Command { 

    //実験リスト 

    private List<Command> commands = new LinkedList<Command>(); 

    //実験を実行するメソッド 

    public void execute() { 

        Iterator<Command> iterator = commands.iterator(); 

        //実験リストの実行 

        Command command = null; 

        while(iterator.hasNext()){ 

            command = iterator.next(); 

            command.execute(); 

        } 

        //実験結果をノートに記述する 

        System.out.println("食塩水を作り、それに食塩を1gずつ加えて飽和食塩水を作る実験"); 

        beaker.note(); 

    } 

    //実験リストに追加するメソッド 

    public void addCommand(Command command){ 

        commands.add(command); 

    } 

}