package sorting;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        sort(arr,arr.length);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    static void sort(int arr[],int n){
        if(n==1) return;

        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        sort(arr,n-1);
    }
}
