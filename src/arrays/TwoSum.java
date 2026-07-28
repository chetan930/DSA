package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,6,5,8,11};
        int target=14;
        System.out.println(twoSum(arr,target));

        System.out.println("---------------------------------------------");

        int a[]=twoSum2(arr,target);
        for (int i:a){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("---------------------------------------------");
        System.out.println(twoSum3(arr,target));
    }


//    brute force
    static String twoSum(int arr[],int target){
        int n=arr.length;

        int idx1=-1;
        int idx2=-1;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i]+arr[j]==target){
                    idx1=i;
                    idx2=j;
                    System.out.println(idx1+" "+idx2);
                    return "YES";
                }
            }
        }

        System.out.println(idx1+" "+idx2);
        return "NO";
    }

//    better approach
    static int[] twoSum2(int arr[],int k){
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(k-arr[i])){
                return new int[]{map.get(k-arr[i]),i};
            }

            map.put(arr[i],i);
        }


        return new int[]{-1,-1};
    }


//    optimal approach if no indices to return we can avoid extra spaced used

    static String twoSum3(int arr[],int target){
        Arrays.sort(arr);
        int i=0;int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==target){
                return "YES";
            }else if(arr[i]+arr[j]>target){
                j--;
            }else{
                i++;
            }
        }

        return "NO";
    }
}
