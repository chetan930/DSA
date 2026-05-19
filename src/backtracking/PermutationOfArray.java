package backtracking;

public class PermutationOfArray {

    public static void main(String[] args) {
        int arr[]={1,2,3};

        printPermution(arr,0,arr.length-1);
    }

    private static void printPermution(int[] arr, int l, int r) {
        if(l==r){
            printArray(arr);
            return;
        }

        for(int i=l;i<=r;i++){
            swap(arr,i,l);
            printPermution(arr,l+1,r);
            swap(arr,i,l);  //backtracking
        }
    }

    private static void swap(int[] arr, int i, int l) {
        int temp=arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
    }

    private static void printArray(int[] arr) {
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }


}
