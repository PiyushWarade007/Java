import java.util.*;
class prime{
    int n;
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        n=sc.nextInt();
    }
    void putdata()
    {
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println(n+"is Prime Number");
        }
        else{
            System.out.println(n+"is Not Prime Number");
        }
        
    }
    public static void main(String[] args) {
        prime aa=new prime();
        aa.getdata();
        aa.putdata();
    }
}
