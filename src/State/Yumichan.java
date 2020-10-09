package State;


public class Yumichan {

    /** 通常の由実ちゃんを表す */

    private static final int STATE_ORDINARY = 0;

 

    /** 機嫌の悪い由実ちゃんを表す */

    private static final int STATE_IN_BAD_MOOD = 1;

 

    /** 由実ちゃんの状態を表すプロパティ */

    private int state = -1;

 

    /**

     * 由実ちゃんの状態を変更するメソッド

     * @param state

     */

    public void changeState(int state) {

        this.state = state;

    }

 

    /**

     * 朝のあいさつを返すメソッド

     * @return

     */

    public String morningGreet() {

        if (state == STATE_ORDINARY) {

            return "おっす!";

        } else if (state == STATE_IN_BAD_MOOD) {

            return "おお";

        } else {

            return "・・・";

        }

    }

 

    /**

     * 寒いときの防寒具を取得するメソッド

     * @return

     */

    public String getProtectionForCold() {

        if (state == STATE_ORDINARY) {

            return "走る";

        } else if (state == STATE_IN_BAD_MOOD) {

            return "ももひきをはく";

        } else {

            return "・・・";

        }

    }

}