package Teacher;
import java.util.*;


public class TestTeacher {
    public static void main(String[] args) {
//        lab 1
//        Scanner t = new Scanner(System.in);
//        System.out.println("Enter teacherID, fullName, salary, email ");
//        int teacherID = t.nextInt();
//        String fullName = t.next();
//        double salary = t.nextDouble();
//        String email = t.next();
//       /* System.out.println(teacherID);
//        System.out.println(fullName);
//        System.out.println(salary);
//        System.out.println(email);
//       */ 
//        
//        Teacher t1 = new Teacher(teacherID, fullName, salary, email);
//        System.out.println("teacherID "+ t1.getTeacherID());
//        System.out.println("full name "+ t1.getFullName());
//        System.out.println("salary"+ t1.getSalary());
//        System.out.println("email"+ t1.getEmail());
        
//        lab 2
        Teacher t1 = new Teacher(101,"hari",85000,"hari@gmail.com");
        Teacher t2=t1;//shallow copy
        t2.showData();//match with t1

        Teacher t3 = new Teacher(102,"Ram",85000,"utammagaju@gmail.com");
        Teacher t4= t3.makeClone(t3);
        t4.showData();

        
    }
   
}
