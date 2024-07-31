import java.util.*;
class rowsum{
    int a[][]=new int[3][3]; 

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrics A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter no:");
                a[i][j]=sc.nextInt();
            }
        }   
    }
    void display(){
        System.out.println("Matrics A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"   ");
                
            }
            System.out.println();
        }
    }
    void row_sum(){
        int sum=0;
        for (int i=0; i<3; i++) {
            sum=0;
            for(int j=0;j<3;j++){
                sum=sum+a[i][j];
            }
            System.out.println("sum of "+(i+1)+" row: "+sum);
        }
    }
    public static void main(String[] args) {
        rowsum aa=new rowsum();
        aa.getdata();
        aa.display();
        aa.row_sum();
    }
}
