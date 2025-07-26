package oops;
import java.util.Scanner;
class Vehicle {
    protected String type;
    Vehicle(String type) {
        this.type = type;
    }
String m1(){
    return type;
    }
}
class car extends Vehicle{
    protected String brand;
    car(String type,String brand){
        super(type);
        this.brand=brand;

    }
    String m2(){
        return brand;
    }
}
public class oop7 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String type=scan.nextLine();
        String brand=scan.nextLine();
        car obj=new car(type, brand);
        System.out.println("Type : "+obj.m1());
        System.out.println("Brand : "+obj.m2());
    }
}
