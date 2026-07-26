package sorting;

public class QuickSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        qSort(arr,0,arr.length-1);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }

    static void qSort(int arr[],int low,int high){
        if(low<high){
            int pivotIndex=partions(arr,low,high);
            qSort(arr,low,pivotIndex-1);
            qSort(arr,pivotIndex+1,high);
        }
    }

    static int partions(int arr[],int low,int high){
        int pivot=arr[high];
        int i=low-1;

        for (int j = low; j < high; j++) {
            if(arr[j]<=pivot){
                i++;
                swap(arr,i,j);
            }
        }

        i++;
        swap(arr,i,high);

        return i;

    }

    static void swap(int arr[],int i,int j ){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
