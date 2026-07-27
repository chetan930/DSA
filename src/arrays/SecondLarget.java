package arrays;

public class SecondLarget {
    public static void main(String[] args) {
        int arr[]={13,46,24,52,20,9,64};
        secondLarge(arr,arr.length);
    }

    static void secondLarge(int arr[],int n){
        int largest=arr[0];
        int smallest=arr[0];
        for (int i = 1; i < n; i++) {
            largest=Math.max(largest,arr[i]);
            smallest=Math.min(smallest,arr[i]);
        }

        int secLarge=Integer.MIN_VALUE;
        int secSmall=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if(secLarge<arr[i] && arr[i]!=largest){
                secLarge=arr[i];
            }
            if(secSmall>arr[i] && arr[i]!=smallest){
                secSmall=arr[i];
            }
        }

        System.out.println("second small "+secSmall);
        System.out.println("second largest "+secLarge);
    }
}
