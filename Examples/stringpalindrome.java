import java.util.*;

class stringpalindrome{
    public static void main(String[] args) {
        String str=new String();
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String str1="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            str1=c+str1;
        }
        if(str.equalsIgnoreCase(str1)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        System.out.println(str1);
    }
}