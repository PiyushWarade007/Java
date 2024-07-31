import java.util.Scanner;

class pattern5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of row:");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int b=1;b<=n-i;b++){
                System.out.print("  ");
            }
            for (int j = 1; j <=(i*2)-1; j=j+1) {
                System.out.print(" *");
            }

            System.out.println();
        }
        n=n-1;
        for (int i = 1; i <= n; i++) {
            for(int b=1;b<=i;b++){
                System.out.print("  ");
            }
            for(int j=1;j<=2*(n-i)+1;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}


