//***********Prime number******************

// import java.util.*;
// class demo9
// {
    
//     public static void main(String args[])
//     {
//         int n,i,count;
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter Number:");
//         n=sc.nextInt();
//         i=1;
//         count=0;
//         while (i<=n) {
//             if(n%i==0){
//                 count=count+1;
//             }
//             i=i+1;
//         }
//         if(count==2){
//             System.out.println("prime number");
//         }
//         else{
//             System.out.println("Not Prime number");
//         }
//     }
// }

//*************prime number 1 to 100****************

class demo9{
    public static void main(String a[])
    {
        int i,j,count;
        for(i=0;i<=100;i++){
            count=0;
            for(j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.println(i);
            }
        }
    }
}