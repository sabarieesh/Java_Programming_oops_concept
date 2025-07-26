/*6.Create a parent class that consists of two methods m1 and m2.
m1 doesn't take any arguments and it just prints from parent.
m2 takes an integer value as parameter and prints the same.
Create a child class that extends parent class and override its methods.
m1 doesn't take any arguments and it just prints from child.
m2 takes an integer value as parameter and prints the same.
In the main class, create objects for the above classes and call the corresponding methods.
Input Format
The input consists of the integer value for both the classes separated by a space.
        Output Format
The output displays the result. Refer sample output.
        Constraints
integers only.

Sample Input  1 2
Sample Output
From parent m1()
1
From child m1()
2*/


package oops;
import java.util.*;
class parent1{
    int x;
    int y;
    parent1(int x){
        this.x=x;
    }
    int m1(){
        return x;
    }
}

class child1 extends parent1{

    child1(int x,int y){
        super(x);
        this.y=y;
    }
    int m2(){
        return y;
    }

}

public class oop6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();

        child1 obj=new child1(x,y);
        System.out.println("From parent m1()");
        System.out.println(obj.m1());
        System.out.println("From parent m2()");
        System.out.println(obj.m2());





    }


}
