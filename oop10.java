package oops;
import java.util.Scanner;
class fun{
    int a;
    int b;

    public int add(int a,int b){
        return a+b;
    }

}
class fun2 extends fun{
    public float add(float a, float b){
        return a+b;
    }
}
public class oop10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        float x=scan.nextFloat();
        float y=scan.nextFloat();
        fun2 obj=new fun2();
System.out.println(obj.add(a,b));
        System.out.println(obj.add(x,y));
    }


}
