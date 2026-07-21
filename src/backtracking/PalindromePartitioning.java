package backtracking;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {

        String s="abbaca";
        List<List<String>> ans=palindrome(s);
        for (List<String> ls:ans){
            for (String ss:ls){
                System.out.print(ss+" ");
            }
            System.out.println();
        }

    }

    static List<List<String>> palindrome(String s){
        List<List<String>> ans=new ArrayList<>();
        helper(s,ans,0,new ArrayList<>());
        return ans;
    }

    static boolean isPalindrome(String s, int l,int r){
        while(l<=r){
            if(s.charAt(l)!=
                    s.charAt(r)){
                return false;
            }

            l++;r--;
        }

        return true;
    }

    static void helper(String s,List<List<String>> ans,int index, List<String> curr){
        if(index==s.length()){
            List<String> copyCurr=new ArrayList<>(curr);
            ans.add(copyCurr);
        }

        for (int i = index; i < s.length(); i++) {
            if(isPalindrome(s,index,i)){
                curr.add(s.substring(index,i+1));
                helper(s,ans,i+1,curr);
                curr.remove(curr.size()-1);
            }
        }
    }
}
