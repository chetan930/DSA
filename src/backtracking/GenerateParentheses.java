package backtracking;

public class GenerateParentheses {
    public static void main(String[] args) {
       generateParenthese(3,"",0,0);
    }

    public static void generateParenthese(int n,String curr, int open,int close){
        if(open==n && close==n){
            System.out.println(curr);
            return;
        }

        if(open<n){
            curr=curr+'(';
            generateParenthese(n,curr,open+1,close);
            curr=curr.substring(0,curr.length()-1); //backtracking
        }

        if(close<open){
            curr=curr+')';
            generateParenthese(n,curr,open,close+1);
        }
    }
}
