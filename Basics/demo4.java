//Sum of N natural number
import java.util.*;
class demo4{
    public static void main(String args[])
    {
        int i,n,sum;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        i=0;
        sum=0;
        while (i<=n) {
            sum=sum+i;
            i=i+1;
        }
        System.out.println("The sum is:"+sum);
    }
}