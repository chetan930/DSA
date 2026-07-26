package Maths;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 1122332211;
        int dup = num;
        int reverseNum = 0;
        while (num > 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num /= 10;
        }

        if (dup==reverseNum){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
