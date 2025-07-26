
/*13.Write a program to find that whether the given number(x) is even or odd if it is even then print the cube(x)+square(x) else print cube(x)-square(x).
Create a base class with a virtual function void print(). print the result by implementing this virtual function in the derived class.

Input Format
The input consists of an Integer.
Output Format
The output prints the result.
        Sample Input
5
Sample Output
100
*/


package oops;
import java.util.Scanner;
class java{
    public void fun1(int x){
        if(x%2==0){
            System.out.println((x*x*x)+(x*x));
        }
        else{
            System.out.println((x*x*x)-(x*x));
        }
    }
}
public class oop13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        java obj=new java();
        obj.fun1(x);
    }
}
