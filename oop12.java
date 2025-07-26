/*
12.Function Overloading
Write a program to implement function overloading.
Ram is given two or three inputs as an integer, if he has two integers then add the two numbers. If he has three inputs, then multiply the three numbers.
Function Header:
public void fun1(int a,int b,int c) public void fun1(int a,int b)

Input Format
First-line represents the number of elements(N) followed by the elements separated by a single space. If the number of the elements exceeds 2 or 3, then display a message as Invalid Input.
        Output Format

Display the sum, if there are two integers or Displays product, if there are three integers.
Constraints

N > 0 and N < 4
Sample Input
3 1 2 3
Sample Output
6

*/

        package oops;
import java.util.*;
class overloading{
    public void fun(int a,int b){
        System.out.println(a+b);
    }
    public void fun(int a,int b,int c){
        System.out.println(a*b*c);
    }
}
public class oop12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        overloading obj=new overloading();
        if(n%2==0){
            obj.fun(a,b);
        }
        else{
            obj.fun(a,b,c);
        }

    }
}
