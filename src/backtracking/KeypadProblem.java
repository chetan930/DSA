package backtracking;

import java.util.ArrayList;

public class KeypadProblem {
    public static void main(String[] args) {

        System.out.println(smartKeypad("23"));

    }

    static ArrayList<String> smartKeypad(String input){
        String map[]={
                "",
                "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"

        };

        ArrayList<String> ans=new ArrayList<>();

        smartKeypadHelper(input,map,0,ans,"");
        return ans;
    }

    private static void smartKeypadHelper(String input, String[] map, int i, ArrayList<String> ans, String curr) {
        if(i==input.length()){
            ans.add(curr);
            return;
        }

        int keypadNumber=input.charAt(i)-'0';
        String keypadString=map[keypadNumber];
        for (int j = 0; j < keypadString.length(); j++) {
            curr+=keypadString.charAt(j);
            smartKeypadHelper(input,map,i+1,ans,curr);
            curr=curr.substring(0,curr.length()-1);
        }
    }
}
