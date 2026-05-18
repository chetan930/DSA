package recursion;

public class CountOccurrenceOfString {
    public static void main(String[] args) {
        String str="abccdgkabccbdgabc";
        String t="abc";
        System.out.println(count(str,t));
    }

    static int count(String s, String t){
        return countOcc(s,t,0);
    }

    static int countOcc(String s, String t, int i){
        if(i> s.length()-t.length()) return 0;

        int subProblemAnswer=countOcc(s,t,i+1);

        boolean checkStaringChar=s.substring(i,i+t.length()).equals(t);
        if(checkStaringChar) return subProblemAnswer+1;
        else return subProblemAnswer;
    }
}
