import java.util.*;
class twodim{
    int a[][]=new int[3][3];
    int b[][]=new int[3][3];
    int c[][]=new int[3][3]; 
    int d[][]=new int[3][3];  

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter matrics A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter no:");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter matrics B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print("Enter no:");
                b[i][j]=sc.nextInt();
            }
        }
    }
    void putdata(){
        System.out.println("Matrics A:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"   ");
                
            }
            System.out.println();
        }
        System.out.println("Matrics B:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(b[i][j]+"   ");
                
            }
            System.out.println();
        }
        System.out.println("Addition of two matrics:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+"   ");
                
            }
            System.out.println();
        }
        System.out.println("Multiplication of two matrics:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(d[i][j]+"   ");
                
            }
            System.out.println();
        }
    }
    void add(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
            }
        }  
    }
    void mul(){
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                d[i][j]=0;
                for(int k=0;k<3;k++){
                d[i][j]=d[i][j]+a[i][k]*b[k][j];
                }
            }
        }  
    }
    public static void main(String[] args) {
        twodim aa=new twodim();
        aa.getdata();
        aa.add();
        aa.mul();
        aa.putdata();
    }
}
