import java.util.Scanner;

class pattern1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.print("Enter number of row:");
        n=sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 1; j <=i+1; j++) {
                System.out.print(i+j+ " ");
            }
            System.out.println();
        }
    }
}
