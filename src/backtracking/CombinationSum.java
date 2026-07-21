package backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {
    public static void main(String[] args) {
        int a[]={8,1,3,7,2,1,5};
        Arrays.sort(a);
        int target=12;
        ArrayList<ArrayList<Integer>> ans=combinationSum(a,target);

        for (ArrayList<Integer> ls: ans){
            System.out.println(ls);
        }
    }

    static ArrayList<ArrayList<Integer>> combinationSum(int a[],int target){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        helper(a,target,0,ans,new ArrayList<>());
        return ans;
    }

    static void helper(int a[], int target, int index,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr){
        if(target==0){
            ArrayList<Integer> copyCurr=new ArrayList<>(curr);
            ans.add(copyCurr);
            return;
        }

        for (int i = index; i <a.length; i++) {
            if(a[i]>target) return;

            if(i>index && a[i]==a[i-1]) continue; ///If want unique subsequences

            curr.add(a[i]);
            helper(a,target-a[i],i+1,ans,curr);
            curr.remove(curr.size()-1); //backtracking
        }
    }
}
