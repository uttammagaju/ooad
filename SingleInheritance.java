/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teacher;
import java.util.*;
class L{
    double length;
    void setLength(double l){
        length = l;
    }
}

class B extends L{
    double breadth;
    void setBreadth(double b){
        breadth = b;
    }
    void area(){
        double area= length *breadth;
        System.out.println("The Area a Rectangle: "+ area);
    }
    
}
public class SingleInheritance {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Please enter length and breadth: ");
        double length = ob.nextDouble();
        double breadth = ob.nextDouble();
        
        B area = new B();
        area.setLength(length);
        area.setBreadth(breadth);
        area.area();
    }
}
