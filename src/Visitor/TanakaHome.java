package Visitor;

public class TanakaHome extends Home implements TeacherAcceptor{

	  public Object praisedChild(){

	      System.out.println("あら、先生ったらご冗談を");
	
	      Tea tea = new Tea();
	      tea.drinkTea();
	     

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
