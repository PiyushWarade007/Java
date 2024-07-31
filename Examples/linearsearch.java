import java.util.*;
class demo{
    int a[]=new int[10];
    int n,key,flag=0,pos;
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
        System.out.print("Enter element you want to search:");
        key=sc.nextInt();
    }
    void search()
    {
        for(int i=0;i<n && flag==0;i++){
            if(key==a[i]){
                flag++;
                pos=i+1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element is found at:"+pos);
        }
        else{
            System.out.println("Element is not found");
        }
    }
}
class linearsearch{
    public static void main(String[] args) {
        demo aa=new demo();
        aa.input();
        aa.search();
    }
}