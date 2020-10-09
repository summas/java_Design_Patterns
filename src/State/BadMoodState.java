package State;

class BadMoodState implements State {

    /**

     * 朝のあいさつです。機嫌の悪いときは、ぶっきらぼうに応えます。

     */

    public String morningGreet() {

        return "おお";

    }

 

    /**

     * 冬の防寒方法です。機嫌の悪いときはももひきをはきます。

     */

    public String getProtectionForCold() {

        return "ももひき";

    }

}