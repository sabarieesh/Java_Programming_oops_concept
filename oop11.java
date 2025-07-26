/*11.Write a program defining 3 functions with the same name "calc" which performs the mathematical operations of Square, Modulus, and Division.

        ●	Function for Square takes in one integer argument and returns an integer value
●	Function for Modulus takes 2 integer arguments and returns an integer value
●	Function for Division takes 2 floating-point arguments and returns and float value


Input Format

Single line input has 2 integer values and 2 floating-point values separated by a space.
Note: First input for Square function: First two inputs for modulus function and last two inputs for division function
Output Format

The output displays the result of the operations in separate lines as shown in the sample test cases.
Sample Input
-8 -6 -5 2.0365
Sample Output
Square of -8: 64
Modulus of -8, -6: -2
Quotient of -5, 2.0365: -2.46
*/

package oops;
import java.util.Scanner;
class math{
    int x;
    public int clac(int  x){
        this.x=x;
        return x*x;
    }
    public int calc(int x,int y){

        return x%y;
    }
    public float calc(int  z,float z1){
        return z/z1;
    }
}
public class oop11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int x=scan.nextInt();
        int y=scan.nextInt();
        int z=scan.nextInt();
        float z1=scan.nextFloat();
        math obj=new math();
        System.out.println(obj.clac(x));
        System.out.println(obj.calc(x,y));
        System.out.printf("%.2f",obj.calc(z,z1));
    }
}
