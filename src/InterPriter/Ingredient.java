package InterPriter;


/**

 * 処理対象を表すクラス

 */

public class Ingredient implements Operand {

    /**

     * この処理対象を表す文字列

     */

    private String operandString = null;

 

    /**

     * 処理対象を表す文字列を引数に取るコンストラクタ

     * @param operandString

     */

    public Ingredient(String operandString) {

        this.operandString = operandString;

    }

 

    /**

     * 処理対象を表す文字列を返すメソッド

     * @return　operandString

     */

    public String getOperandString() {

        return this.operandString;

    }

}