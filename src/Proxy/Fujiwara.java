package Proxy;

import java.util.Calendar;

public class Fujiwara implements Teacher {

    private Teacher yamada = new Yamada();

 

    public void question1() {

        System.out.println("それは「～～解答1～～」です。");

    }

 

    public void question2() {

        System.out.println("それは「～～解答2～～」です。");

    }

 

    public void question3() {

    /**    System.out.print("答えは「");

        //藤原先生には答えられないので、山田先生に聞く

         yamada.question3();

        System.out.println("」となります。");
        **/
        Calendar now = Calendar.getInstance();

        if (Calendar.AM == now.get(Calendar.AM_PM)) {

            //午前中は山田先生に聞く

              System.out.print("答えは「");

            yamada.question3();

            System.out.println("」となります。");

        } else {

            //午後からは返答を明日にする

              System.out.println("明日、返答します。");

        }
        

    }

 

}