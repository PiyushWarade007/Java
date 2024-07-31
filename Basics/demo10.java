import java.util.*;
public class demo10 {
    static int fab(int n)
    {
        if(n<=1)
        return n;
        else
        return fab(n-1)+fab( n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int N=sc.nextInt();
        for(int i=0;i<N;i++){
            System.out.print(fab(i)+" ");
        }  
    }  
}