package Visitor;

import java.util.List;



public class RookieTeacher extends Teacher{

    List students = null;

    public RookieTeacher(List students){

        this.students = students;

    }

    public void visit(Home studentHome){

        System.out.println("‚±‚ñ‚É‚¿‚Í");

    }

    public void visit(TanakaHome studentHome){
    //Teacher teacher = new  RookieTeacher();
        studentHome.praisedChild();
   //     studentHome.accept(null);

    }

    public void visit(SuzukiHome studentHome){

        studentHome.reprovedChild();

    }

} 