package backtracking;

import java.util.*;

public class Practice4 {
    public static void main(String[] args) {

//        int arr[]={1,2,3};
//        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//        findSubsequences2(arr,ans,new ArrayList<>(),0);
////        Collections.sort(ans, (a, b) -> Integer.compare(a.size(), b.size()));
//        for (ArrayList<Integer> a: ans){
//            System.out.print(a+", ");
//        }


        //combinationSum
        int arr[]={8,1,3,7,2,1,5};
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        combinationSum(arr,12,0,ans,new ArrayList<>(),0);
        for (ArrayList<Integer> a: ans){
           System.out.println(a+", ");
       }
    }

    static void findSubsequences(int arr[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,int idx){
        if(idx== arr.length){
            ArrayList<Integer> copy=new ArrayList<>(curr);
            ans.add(copy);
            return;
        }

        curr.add(arr[idx]);
        findSubsequences(arr,ans,curr,idx+1);
        curr.removeLast();
        findSubsequences(arr,ans,curr,idx+1);
    }
    static void findSubsequences2(int arr[],ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,int idx){
        ArrayList<Integer> copy=new ArrayList<>(curr);
        ans.add(copy);

        for (int i = idx; i < arr.length; i++) {
            curr.add(arr[i]);
            findSubsequences2(arr,ans,curr,i+1);
            curr.removeLast();
        }
    }


    static void combinationSum(int arr[],int target,int sum,ArrayList<ArrayList<Integer>> ans,ArrayList<Integer> curr,int idx){
        if(sum==target){
            ArrayList<Integer> copy=new ArrayList<>(curr);
            ans.add(copy);
        }

        for (int i = idx; i < arr.length; i++) {
            curr.add(arr[i]);
            combinationSum(arr,target,sum+arr[i],ans,curr,i+1);
            curr.removeLast();
        }
    }
}
