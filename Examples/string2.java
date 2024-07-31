// *******Total no of Words*******
import java.util.*;
class string2{
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        s=sc.nextLine();
        int count=1;
        for (int i = 0; i < s.length()-1; i++) {
            char c=s.charAt(i);
            char d=s.charAt(i+1);
            if(c==' ' && d!=' '){
                count++;
            }
        }
        System.out.println("Words are:"+count);
    }
}
