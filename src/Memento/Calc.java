package Memento;

public class Calc {

    private int temp = 0;

 

    /**

     * 足し算を実行するメソッド

     * @param plus

     */

    public void plus(int plus) {

        temp += plus;

    }

 

    /**

     * 途中経過を Memento として取得するメソッド

     * @return memento

     */

    public Memento createMemento() {

        return new Memento(temp);

    }

 

    /**

     * Memento から計算経過を取得して、temp にセットする

     * @param memento

     */

    public void setMemento(Memento memento) {

        this.temp = memento.result;

    }

 

    /**

     * 計算結果を取得するメソッド

     * @return temp

     */

    public int getTemp() {

        return this.temp;

    }

 

    /**

     * 途中経過を保持する Memento クラス

     */

    public class Memento {

        /** 計算の途中経過を表す */

        private int result = -1;

 

        /**

         * 計算経過を引数に受け取るコンストラクタ

         * @param temp

         */

        Memento(int temp) {

            this.result = temp;

        }

    }

}