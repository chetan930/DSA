package arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumProblem {
    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,-4};
        Arrays.sort(a);

        List<List<Integer>> triplet=new ArrayList<>();

        for (int i = 0; i < a.length-2; i++) {
            if(i>0 && a[i]==a[i-1]) continue;

            List<List<Integer>> temp=twoSum(a,-a[i],i+1,a.length-1);
            for (List<Integer> list:temp){
                list.add(0,a[i]);
                triplet.add(list);
            }

        }

        System.out.println(triplet);
    }

    static List<List<Integer>> twoSum(int a[],int sum,int start,int end){
        List<List<Integer>> ans=new ArrayList<>();

        while(start<end){
            if(a[start]+a[end]>sum){
                end--;
            } else if (a[start]+a[end]<sum) {
                start++;
            }else {
                ans.add(new ArrayList<>(Arrays.asList(a[start],a[end])));
                start++;
                end--;
            }
        }

        return ans;
    }
}
