
package Teacher;
import java.util.*;
public class Car {
    private String model;
    private String color;
    private double price;
    private static int carCount;
    
    public Car(String model, String color, double price){
        this.model = model;
        this.color = color;
        this.price = price;
        carCount++;
    }
    public static int getCarCount(){
        return carCount;
    }
    public String getColor(){
        return color;
    }
    public double getPrice(){
        return price;
    }
    public String getModel(){
        return model;
    }
    public static void printCarCount(){
            System.out.println("Total no of car: " + carCount);
    }
    public static void main(String[] args){
        Car[] cars = new Car[3];
        Scanner ob = new Scanner(System.in);
        
        
        for(int i=0;i<cars.length; i++){
            System.out.println("Enter model, color and price:");
            String model = ob.next();
            String color = ob.next();
            double price = ob.nextDouble();
            cars[i] = new Car(model,color,price );
        }
        
        System.out.println("Display details");
        for(int i = 0;i<cars.length; i++){
            System.out.println("Model: "+ cars[i].model+" "+"Color: "+ cars[i].color+" "+"Price: "+cars[i].price);
        }
        Car.printCarCount();
    }
}
