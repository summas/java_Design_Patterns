package Memento;


import java.util.HashMap;

import java.util.Map;

 

/**

 * 計算する和田山君クラス。

 */

public class Wadayama {
	private static Map<String,Calc.Memento> map = new HashMap<String,Calc.Memento>(); 

    /**

     * 計算を実行するクラス

     * @param args

     */

    public static void main(String args[]) {

        Calc calc = new Calc();

        for (int n = 1; n <= 5; n++) {

            calc.plus(n);

        }

        System.out.println(calc.getTemp());

        map.put("5までの足し算", calc.createMemento());

        // 数日経過

        // 10までの足し算をしたい。

        Calc calc2 = new Calc();
        calc2.setMemento(map.get("5までの足し算"));

        for (int n = 6; n <= 10; n++) {

            calc2.plus(n);

        }

        System.out.println(calc2.getTemp());

        map.put("10までの足し算", calc2.createMemento());

    }
}
