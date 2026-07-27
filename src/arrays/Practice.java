package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int k=arr.length-2;
        leftRotateByN(arr,arr.length,k);

        for(int a:arr){
            System.out.print(a+" ");
        }
    }

    static void leftRotateByN(int arr[],int n,int k){
        for (int i = 0; i < k; i++) {
            int temp=arr[0];
            for (int j = 1; j < n; j++) {
                arr[j-1]=arr[j];
            }
            arr[n-1]=temp;
        }
    }



}
