import java.util.*;
public class palindrome01 {
    public static void isPalindrome(String s){
        int n=s.length();
        for(int i=0;i<=n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                System.out.println("Not a palindrome");
                break;
            }

            else{
                System.out.println("Palindrome");
            }
        }
    }

    public static void main(String[] args) {
        String s="abc";
        isPalindrome(s);
    }
}
