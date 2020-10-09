package InterPriter;


/**

 * 足し合わせる処理を表すクラス

 */

public class Plus implements Operator {

    private Operand operand1 = null;

    private Operand operand2 = null;

 

    /**

     * 足される2つの operand を引数に取るコンストラクタ

     * @param operand1

     * @param operand2

     */

    public Plus(Operand operand1, Operand operand2) {

        this.operand1 = operand1;

        this.operand2 = operand2;

    }

 

    /**

     * 処理を実行するメソッド

     * @return string

     */

    public Operand execute() {

        return new Ingredient(operand1.getOperandString() + "と"

                + operand2.getOperandString() + "を足したもの");

    }

}