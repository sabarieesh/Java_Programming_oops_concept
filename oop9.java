package oops;
import java.util.*;
class parent2{
    private int sum;
    parent2(int n) {
        String s=Integer.toString(n);
        int num=s.length();
        int a[]=new int[num];
        for(int i=0;i<num;i++){
            a[i]=s.charAt(i)-'0';
        }
        int b[]=new int[num];
        for(int i=num-1;i>=0;i--){
            b[i]=a[i];
        }
         sum=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                sum=sum+b[i]+b[j];
            }
        }
    }
    int getsum() {
        return sum;
    }

}
class child2 extends parent2{
    child2(int n) {
         super(n);
     }
}
public class oop9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        parent2 obj=new parent2(n);
        System.out.println(obj.getsum());
    }
}
