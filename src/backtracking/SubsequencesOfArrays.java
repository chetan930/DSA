package backtracking;

import java.util.ArrayList;

public class SubsequencesOfArrays {

    public static void main(String[] args) {
        int a[]={4,4,6,4};

        ArrayList<ArrayList<Integer>> ans=subsequences(a);

        for(ArrayList<Integer> ls: ans){
            System.out.println(ls);
        }

    }

    static ArrayList<ArrayList<Integer>> subsequences(int a[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        subsequencesHelper(a,ans,0,new ArrayList<>());

        return ans;
    }

    static void subsequencesHelper(int a[],ArrayList<ArrayList<Integer>> ans,int index,ArrayList<Integer> curr){
        ArrayList<Integer> copyCurr=new ArrayList<>(curr);
        ans.add(copyCurr);

        for (int i=index;i<a.length;i++){

            if(i>index && a[i]==a[i-1]) continue; ///If want unique subsequences

            curr.add(a[i]);
            subsequencesHelper(a,ans,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
