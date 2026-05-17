package arrays;

public class LastElementInSortedPosition {

    public static void main(String[] args) {
        int[] arr ={2,5,6,8,9,4};
        int n= arr.length;
        int last=arr[n-1];
        int swapIndex=n-2;
        while(swapIndex>=0 && arr[swapIndex]>last){
            arr[swapIndex+1]=arr[swapIndex];
            swapIndex--;
        }

        arr[swapIndex+1]=last;

        for (int a: arr){
            System.out.print(a+" ");
        }
    }
}
