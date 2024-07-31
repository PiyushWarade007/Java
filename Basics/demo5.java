//Reverse the number
import java.util.*;
class demo5
{
    
    public static void main(String args[])
    {
        int n,rev;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        rev=0;
        while (n>0) {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        System.out.println("The Reverse number is:"+rev);
    }
}