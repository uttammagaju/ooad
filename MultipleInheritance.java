/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;
interface Details{
    void showDetails();
}

class User{
    String username, lastname;
    User(String username, String lastname){
        this.username= username;
        this.lastname = lastname;
    }
}

class UserDetails extends User implements Details{
    UserDetails(String username, String lastname){
        super(username, lastname);
    }
    public void showDetails(){
        System.out.println("username:"+username);
        System.out.println("lastname:"+lastname);
    }
    
}
public class MultipleInheritance {
    public static void main(String[] args) {
        UserDetails ob = new UserDetails("uttam", "magaju");
        ob.showDetails();
    }
}
