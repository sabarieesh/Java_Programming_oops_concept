package oops;
class wall{
    double l;
    double b;
 wall(double l,double b){
this.l=l;
this.b=b;
 }
    public  double  cal(){
        return l*b;
    }
 }
public class oop3 {
    public static void main(String[] args){
        wall obj=new wall(50,60);
        System.out.println(obj.cal());
    }
}
