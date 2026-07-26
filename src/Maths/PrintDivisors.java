package Maths;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisors {
    public static void main(String[] args) {
        int n=36;
        List<Integer> ans=new ArrayList<>();
        ans=printDiivisors(n,ans);
        System.out.println(ans);
    }

    public static List<Integer> printDiivisors(int n,List<Integer> ans){
        for (int i = 1; i <=n; i++) {
            if(n%i==0){
                ans.add(i);
            }
        }

        return ans;
    }
}
