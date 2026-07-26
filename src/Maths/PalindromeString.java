package Maths;

public class PalindromeString {
    public static void main(String[] args) {
        String str="ABCDCcBA";

        System.out.println(palindrome(str,0,str.length()-1));
        System.out.println(checkPalindrome(str));
    }

    static boolean checkPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;

        }

        return true;
    }

    static boolean palindrome(String str,int i,int j){
        if(i==j){
            return true;
        }

        return str.charAt(i)==str.charAt(j) && palindrome(str,i+1,j-1);
    }
}
