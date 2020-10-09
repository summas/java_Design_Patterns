package Visitor;


//鈴木さんの家庭

public class SuzukiHome extends Home implements TeacherAcceptor{

  public Object praisedChild(){

      System.out.println("あら、先生ったらご冗談を");

      return new Tea();
  }
      
  public Object reprovedChild(){

      System.out.println("うちの子に限ってそんなことは・・・。");



      return null;

  }

  /**

   * 訪問者を受け入れるメソッド

   */

  public void accept(Teacher teacher){

      teacher.visit(this);

  } 

}
