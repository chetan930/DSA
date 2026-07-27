package arrays;

import java.util.Arrays;

public class FIndMissingElement {
    public static void main(String[] args) {
        int arr[]={8,2,4,5,3,7,1};
        int n=arr.length;
        Arrays.sort(arr);
//        for (int i = 1; i <=n ; i++) {
//            if(arr[i-1]!=i){
//                System.out.println(i);
//                break;
//            }
//        }

        int sum=0;
        int mx=Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            sum+=arr[i];
        }

        int m=n+1;

        System.out.println(sum);

        System.out.println((m*(m+1)/2)-sum);
    }
}
