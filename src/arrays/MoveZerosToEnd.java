package arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int arr[]={1,0,2,3,0,4,0,1};
        moveZeros(arr,arr.length);

        for (int a:arr){
            System.out.print(a+" ");
        }
    }

//    static void moveZeros(int arr[],int n){
//        int temp[]=new int[n];
//        int idx=0;
//        for (int i = 0; i < n; i++) {
//            if(arr[i]!=0){
//                temp[idx]=arr[i];
//                idx++;
//            }
//        }
//
//        for (int i = 0; i < n; i++) {
//            arr[i]=temp[i];
//        }
//    }

    static void moveZeros(int arr[],int n){
        int j=-1;
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1){
            return;
        }

        for (int i = j+1; i < n; i++) {
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }
}

