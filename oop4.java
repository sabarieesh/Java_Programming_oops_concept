
package oops;
import java.util.*;
class parent{
    Scanner scan=new Scanner(System.in);
    int a=scan.nextInt();
    int b=scan.nextInt();
    parent (){
        System.out.println(a+b);
    }
}
class child extends parent{
    child(){
        System.out.println(a-b);
    }
}
public class oop4 {
    public static void main(String[] args){

        child obj=new child();

    }

}
