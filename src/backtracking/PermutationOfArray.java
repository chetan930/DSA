package backtracking;

import java.lang.reflect.Array;

public class PermutationOfArray {

    public static void main(String[] args) {
//        int arr[]={1,2,3};
        String str="123";
        char[] arr= str.toCharArray();
        printPermutation(arr,0,arr.length-1);
    }


    static void printPermutation(char arr[],int l,int r){
        if(l==r){
//            printArray(arr);
            System.out.println(new String(arr));
            return;
        }

        for (int i = l; i <=r ; i++) {
            swap(i,l,arr);
            printPermutation(arr,l+1,r);
            swap(i,l,arr);
        }
    }

    static void printArray(char arr[]){
        for (char i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


    static void swap(int l,int r,char arr[]){
        char temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }


}
