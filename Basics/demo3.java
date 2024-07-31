//Simple Calculator
import java.util.*;
class demo3 {
    public static void main(String args[])
    {
        int a,b,ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 Num:");
        a=sc.nextInt();
        System.out.println("Enter 2 Num:");
        b=sc.nextInt();
        System.out.println("1.ADD ,2.SUB ,3.MUL ,4.DIV");
        ch=sc.nextInt();
        if (ch==1) {
            System.out.println("Addition:"+(a+b));
        } 
        else if(ch==2) {
            System.out.println("Substraction:"+(a-b));
        }
        else if(ch==3) {
            System.out.println("Multiplication:"+(a*b));
        }
        else if(ch==2) {
            System.out.println("Division:"+(a/b));
        }
        else{
            System.out.println("Invalid Choice");
        }
    }
}
