//sum of even and product of odd digit
import java.util.*;
class demo7
{
    
    public static void main(String args[])
    {
        int n,sum,pro,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        sum=0;
        pro=1;
        while (n>0) {
           digit=n%10;
            if(digit%2==0){
                sum=sum+digit;
            }
            else{
                pro=pro*digit;
            }
            n=n/10;
        }
        System.out.println("Sum of Even Digit is:"+sum);
        System.out.println("Product of Odd Digit is:"+pro);
    }
}
