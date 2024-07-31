import java.util.*;
public class arrayex {
    public static void main(String[] args) {
        // int arr[]={1,3,4,2,5,6};
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x,y=1,z=0;
        while(z<=n){
            System.out.print(z+" ");
            x=y;
            y=z;
            z=x+y;
        }
        
    }
}

