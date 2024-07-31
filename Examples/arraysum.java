import java.util.*;
class demo{
    int a[]=new int[10];
    int n;
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        n=sc.nextInt();
        for(int i=0;i<n;i++){
            
            System.out.print("Enter number:");
            a[i]=sc.nextInt();
        }
        System.out.println();
    }
    void Display()
    {
        for (int i = 0; i < n; i++) {
            System.out.println(i+"index Element :"+a[i]);
        }
    }
    void sum()
    {
        int sum=0;
        for (int i = 0; i <n; i++) {
            sum=sum+a[i];
        }
        System.out.println("Sum:"+sum);
    }
}
class arraysum{
    public static void main(String[] args) {
        demo aa=new demo();
        aa.input();
        aa.Display();
        aa.sum();
    }
}