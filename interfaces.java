package oops;

import java.sql.SQLOutput;

interface vehicle{
    void start();
}
class bike implements vehicle{
    public void start()
    {
        System.out.println("Bike is Started");
    }
}
public class interfaces {
    public static void main(String[] args) {
        bike obj=new bike();
        obj.start();
    }
}
