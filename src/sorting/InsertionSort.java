package sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};

        for (int i = 1; i < arr.length; i++) {
            int j=i-1;
            int curr=arr[i];
            while(j>=0 && arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }

            arr[j+1]=curr;
        }


        for (int k:arr){
            System.out.print(k+" ");
        }
    }
}
