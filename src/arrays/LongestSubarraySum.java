package arrays;

import java.util.HashMap;

public class LongestSubarraySum {
    public static void main(String[] args) {
        int arr[]={10,5,2,7,1,9};
        int k=15;
//   Brute force
//        int n=arr.length;
//
//        int maxLength=-1;
//
//        for (int i = 0; i < n; i++) {
//            for (int j = i; j < n; j++) {
//                int sum=0;
//                for (int l = i; l <=j; l++) {
//                    sum+=arr[l];
//                }
//
//                if(sum==k){
//                    maxLength=Math.max(maxLength,j-i+1);
//                }
//            }
//        }



        int maxLength=longestSubarray(arr,k);

        System.out.println(maxLength);
    }

    //        optimse but and can also handle non postive
//    static int longestSubarray(int arr[],long k){
//        int maxLen=0;
//        long sum=0;
//        HashMap<Long,Integer> preSumMap=new HashMap<>();
//        for (int i = 0; i < arr.length; i++) {
//            sum+=arr[i];
//            if(sum==k){
//                maxLen=Math.max(maxLen,i+1);
//            }
//
//            long rem=sum-k;
//            if(preSumMap.containsKey(rem)){
//                int len=i-preSumMap.get(rem);
//                maxLen=Math.max(maxLen,len);
//            }
//
//            if(!preSumMap.containsKey(sum)){
//                preSumMap.put(sum,i);
//            }
//        }
//
//        return maxLen;
//    }


    static int longestSubarray(int arr[],long k){
        int maxLen=0;
        int left=0;
        int right=0;
        int n=arr.length;
        int sum=arr[0];
        while(right<n){

            while(left<=right && sum>k){
                sum-=arr[left];
                left++;
            }

            maxLen=Math.max(maxLen,right-left+1);
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }

        return maxLen;
    }
}
