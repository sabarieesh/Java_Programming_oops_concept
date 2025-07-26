package oops;
import java.util.*;
public class excep {
    public static void main(String[] args) {
        int a[]={5,10};
        try{
            System.out.println(a[10]);
        }
        catch(Exception e){

            System.out.println(e.getMessage());

        }

        finally{
            System.out.println("executed successfully");
        }
        System.out.println(a[0]);
    }
}
