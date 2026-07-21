package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MinimumDifference {
    public static void main(String[] args) {
        int arr[]={12,9,8,2,11};
        Arrays.sort(arr);
        int smallest=arr[1]-arr[0];
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i+1]-arr[i]<smallest){
                smallest=arr[i+1]-arr[i];
            }
        }

        for (int i = 1; i < arr.length-1; i++) {

            if(arr[i+1]-arr[i]==smallest){
                ans.add(new ArrayList<>(Arrays.asList(arr[i],arr[i+1])));
            }
        }

        System.out.println(ans);
    }
}
