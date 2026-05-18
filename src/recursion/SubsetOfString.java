package recursion;

public class SubsetOfString {
    public static void main(String[] args) {
        printSubset("abc", 0, "");
    }

    static void printSubset(String s, int i, String curr){
        if(s.length()==i){
            System.out.println(curr);
            return;
        }

        printSubset(s,i+1,curr+s.charAt(i));
        printSubset(s,i+1,curr);

    }
}
