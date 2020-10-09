package State;


class OrdinaryState implements State {

    /**

     * 朝のあいさつです。通常は、男らしく応えます。

     */

    public String morningGreet() {

        return "おっす！";

    }

 

    /**

     * 冬の防寒方法です。走るようです。

     */

    public String getProtectionForCold() {

        return "走る";

    }

}