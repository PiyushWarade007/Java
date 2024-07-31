//palindrome of number
import java.util.*;
class demo8
{
    
    public static void main(String args[])
    {
        int n,rev,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number:");
        n=sc.nextInt();
        digit=n;
        rev=0;
        while (n>0) {
            rev=(rev*10)+n%10;
            n=n/10;
        }
        if(digit==rev){
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}