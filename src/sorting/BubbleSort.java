package sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9};
        for (int i = 0; i < arr.length-1; i++) {
            boolean didSwap=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    didSwap=true;
                }
            }
            if(didSwap==false){
                break;
            }
        }

        for (int el:arr){
            System.out.print(el+" ");
        }
    }

}
