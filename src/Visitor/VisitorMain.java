package Visitor;

import java.util.ArrayList;
import java.util.List;

public class VisitorMain {

	public static void main(String[] args) {
		
		TanakaHome Tanaka = new TanakaHome();
		SuzukiHome Suzuki = new SuzukiHome();
		
	Object Student1 = "SuzukiHome";
	List<Object> students = new ArrayList<Object>();
//	List students = (List)Student1;
	students.add(Student1);
	
	 RookieTeacher visit1 = new  RookieTeacher(students);
	 
	 visit1.visit(Tanaka);
	 visit1.visit(Suzuki);
	}
}
