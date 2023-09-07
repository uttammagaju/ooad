
package Teacher;


public class Teacher {
    private int teacherID;
    private String fullName;
    private double salary;
    private String email;

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public Teacher(){
        
    }
    


    public Teacher(int teacherID,String fullName, double salary,String email){
        this.teacherID = teacherID;
        this.fullName = fullName;
        this.salary = salary;
        this.email = email;
    }
    public Teacher makeClone(Teacher t){
        this.teacherID = t.teacherID;
        this.fullName = t.fullName;
        this.salary = t.salary;
        this.email = t.email;
        return this;
    }
    public void showData(){
        System.out.println("teacherID:"+teacherID );
        System.out.println("fullName:"+ fullName);
        System.out.println("salary:"+ salary);
        System.out.println("email:"+ email);
    }
}
  