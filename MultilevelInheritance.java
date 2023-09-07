
package Teacher;
class Le{
    double length;
    void setLength(double l){
        length = l;
    }
}
class Be extends Le{
    double breadth;
    void setBreadth(double b){
        breadth = b;
    }
}
class H extends Be{
    double height;
    void setHeight(double h){
        height = h;
    }
    void volume(){
        double volume= length *breadth *height;
        System.out.println("The voulum is of room is: "+ volume);
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        H ob = new H();
        ob.setBreadth(5);
        ob.setLength(5);
        ob.setHeight(5);
        ob.volume();
    }
}
