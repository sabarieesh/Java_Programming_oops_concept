package oops;
import java.util.Scanner;

class shape{
    int a;
    int b;

    shape(int a,int b){
        this.a=a;
        this.b=b;
    }
    int m1(){
        return a*b;
    }
}
class square extends shape{
    int c;
    square(int c){
      super( c,c);
       this.c=c;
    }
    int  m2(){
        return c*c;
    }
}
class circle extends square{
    int d;
    circle(int d){
        super(d);
        this.d=d;
    }
    double m3(){
        return (22.0/7)*(d*d);
    }
}
public class oop8 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int d=scan.nextInt();
        shape obj=new shape(a,b);
        square obj1=new square(c);
        circle obj2=new circle(d);
        System.out.println(obj.m1());
        System.out.println(obj1.m2());
        System.out.printf("%.2f",obj2.m3());


    }
}
