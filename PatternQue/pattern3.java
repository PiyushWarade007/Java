import java.util.Scanner;

class pattern3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of row:");
        n=sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" "+(i+j));
            }

            System.out.println();
        }
    }
}