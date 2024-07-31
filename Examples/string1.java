// Total No of Vowel and Consonants
import java.util.*;
class string1{
    public static void main(String[] args) {
        String s=new String();
        int vow=0,con=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        s=sc.nextLine();
        s=s.toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if(ch!=' '){
                if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    vow++;
                }
                else{
                    con++;
                }
            }
        }
        System.out.println("no of vowel are:"+vow);
        System.out.println("no of consonant are:"+con);
    }
}