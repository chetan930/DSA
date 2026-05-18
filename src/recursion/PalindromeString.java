package recursion;

public class PalindromeString {
    public static void main(String[] args) {
        System.out.println(palindrome("racecar"));
    }

    static boolean palindrome(String str){
        return isPalindrome(str,0,str.length()-1);
    }

    static boolean isPalindrome(String s, int l, int r){
        if(l>=r) return true;

        if(s.charAt(l)==s.charAt(r)){
            return isPalindrome(s,l+1,r-1);
        }
        else {
            return false;
        }
    }
}
