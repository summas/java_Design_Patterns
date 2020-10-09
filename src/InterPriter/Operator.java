package InterPriter;


/**

 * 処理を表すインタフェース

 */

public interface Operator {

    /**

     * 実行結果の operand を返すメソッド

     * @return operand

     */

    public Operand execute();

}