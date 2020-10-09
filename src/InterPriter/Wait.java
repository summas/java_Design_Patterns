package InterPriter;


/**

 * 「待つ」という処理を表すクラス

 */

public class Wait implements Operator {
	
    private int minutes = -1;

    private Operand operand = null;


    /**

     * 足される2つの operand を引数に取るコンストラクタ

     * @param minutes

     * @param operand

     */

    public Wait(int minutes, Operand operand) {

        this.minutes = minutes;

        this.operand = operand;

    }

 

    /**

     * 処理を実行するメソッド

     * @return string

     */

    public Operand execute() {

        return new Ingredient(operand.getOperandString() + "を" + minutes

                + "分置いたもの");

    }

}