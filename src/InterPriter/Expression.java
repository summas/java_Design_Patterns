package InterPriter;

/**

* 処理結果を表すクラス

*/

public class Expression implements Operand {

   /**

    * operator

    */

   private Operator operator = null;



   /**

    * 処理内容を表す operator を引数に取るコンストラクタ

    * @param operator

    */

   public Expression(Operator operator) {

       this.operator = operator;

   }



   /**

    * 処理の結果得られる Operand の文字列表現を返すメソッド

    * @return　operandString

    */

   public String getOperandString() {

       return operator.execute().getOperandString();

   }
}