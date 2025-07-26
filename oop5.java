/*An ice-cream vendor sells his ice-creams in cone(radius r and height h) and ball(radius r) shaped containers. However, he is unsure of the quantity that can be filled in the two containers. You are required to write a program in java that prints the volume of the containers given its respective dimensions as input. Your class must be named ‘Icecream’ which has two methods with same name ‘Quantity’ each having the respective dimensions of the containers as the parameters.
Function Header:
public void Quantity(int r, int h)
pu
blic void Quantity(int r)
Input Format
If the quantity of the cone is to be calculated, the input must have the radius(r) and height(h) in the same line separated by a space.
For calculating the quantity of the ball, the input must have its radius(r).
Note: Input type should be integer.
        Output Format
The output must display the volume of the container rounded off to two decimal places for which the dimensions are given.

        Sample Input
4 5
        4
Sample Output
82.90
  267.28*/


package oops;
class cone{
    int  r;
    int h;
     cone(int r,int h){
        this.r=r;
        this.h=h;
    }
    cone(int r){
        this.r=r;
    }
public double volsphere(){
        double sphere=(4.0/3.0)*(22.0/7.0)*(r*r*r);
        return sphere;
}
    public double volcone(){
        double  cone=(1.0/3.0)*(22.0/7.0)*(r*r)*(h);
        return cone;
    }
}
public class oop5 {
    public static void main(String[] args){
        cone obj=new cone(4,5);
        cone obj1=new cone(4);
        System.out.printf("%.2f\n",obj.volsphere());
        System.out.printf("%.2f",obj.volcone());
    }
}
