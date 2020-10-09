package Iterator;

//import java.util.Vector;

public class MyTeacher extends Teacher{

    private StudentList studentList;

 

    public void createStudentList(){

        studentList = new StudentList(5);

        studentList.add(new Student("Ôˆä—º‘¾",1));

        studentList.add(new Student("Ô‰H—¢”ü",2));

        studentList.add(new Student("‰ª“c”ü‰›",2));

        studentList.add(new Student("¼Xr‰î",1));

        studentList.add(new Student("’†ƒmX—æØ",2));

    }

    public void callStudents(){

        int size = studentList.getLastNum();

        for(int n=0;n<size;n++){

            System.out.println(studentList.getStudentAt(n).getName());

        }

    }

/**
public void callStudents(){

    Iterator itr = studentList.iterator();

    while(itr.hasNext()){

        System.out.println(((Student)itr.next()).getName());
    	}
	}**/
} 