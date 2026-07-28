package arrays;

import java.util.Arrays;

public class SortArrayOf012 {
    public static void main(String[] args) {
        int arr[]={1,0,2,1,0};
//        sort1(arr);

        System.out.println("---------------------------------------------");

//        sort2(arr);

        System.out.println("---------------------------------------------");

        sor3(arr);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

    static void sort1(int arr[]){
        Arrays.sort(arr);
    }

    static void sort2(int arr[]){
        int zeros=0;
        int ones=0;
        int twos=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0){
                zeros++;
            }else if(arr[i]==1){
                ones++;
            }else{
                twos++;
            }
        }

        System.out.println(zeros+" "+ones+" "+twos);

        int idx=0;
        for (int i = 0; i < zeros; i++) {
            arr[idx++]=0;
        }
        for (int i = 0; i < ones; i++) {
            arr[idx++]=1;
        }
        for (int i = 0; i < twos; i++) {
            arr[idx++]=2;
        }
    }

    //optimal approach
    static void sor3(int arr[]){
        int low=0,mid=0,high=arr.length-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
}
