package arrays;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {

        String str="abbccbba";
        String ans="";
//        for (int i = str.length()-1; i >=0; i--) {
//            ans+=str.charAt(i);
//        }
        System.out.println(checkPalindrome(str));
        System.out.println(ans);

    }

    static boolean checkPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }

        }
        return true;
    }
}
