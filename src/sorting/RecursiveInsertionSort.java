package sorting;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        sort(arr,1,arr.length);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    static void sort(int arr[],int i,int n){
        if(i==n) return;

        int j=i-1;
        int curr=arr[i];
        while (j>=0 && arr[j]>curr){
            arr[j+1]=arr[j];
            j--;
        }

        arr[j+1]=curr;

        sort(arr,i+1,n);


    }
}
