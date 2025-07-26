package oops;
import java.util.*;

public class excep1 {
    public static void main(String[] args) {
        int x = 0;
        int a[] = {5, 10};

        try {
            int y = 25 / x;  // This will throw ArithmeticException
            a[0] = a[1] / a[0] - 5;
        }
        catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of bound");
        }
        catch (Exception e) {
            System.out.println("Some other exception occurred");
        }

        System.out.println("x = " + x);
    }
}
