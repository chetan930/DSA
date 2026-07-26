package Maths;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[]={5,4,3,2,1};
        int start=0;
        int end=arr.length-1;
//        while (start<=end){
//            swap(arr,start,end);
//            start++;
//            end--;
//        }

        reverse(arr,start,end);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    static void reverse(int arr[],int start,int end){
        if(start>end){
            return;
        }

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
        reverse(arr,start,end);
    }
}
