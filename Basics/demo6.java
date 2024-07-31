//Sum of digit
import java.util.*;
class demo6
{
    
    public static void main(String args[])
    {
        int n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        sum=0;
        while (n>0) {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of Digit is:"+sum);
    }
}
