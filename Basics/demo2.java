//Max Number
import java.util.*;
class demo2 {
    public static void main(String args[])
    {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 Num:");
        a=sc.nextInt();
        System.out.println("Enter 2 Num:");
        b=sc.nextInt();
        if (a>b) {
            System.out.println("a is greater than b");
        } else {
            System.out.println("b is greater than a");
        }
    }
}
