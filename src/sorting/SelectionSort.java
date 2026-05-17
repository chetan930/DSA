package sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={4,1,8,2,3,7};

        for (int i = 0; i < arr.length; i++) {
            int min=i; //assume is  min index
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;


        }

        for (int a:arr){
            System.out.print(a+" ");
        }
    }
}
