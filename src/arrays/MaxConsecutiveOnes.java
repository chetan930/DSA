package arrays;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[]={1,1,0,1,1,1,0,0,1,1,1,0,0,1,1,0,1,1,1,1};

        int mxCount=0;
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=1){
                count=0;
            }else{
                count++;
            }
            mxCount=Math.max(mxCount,count);
        }

        System.out.println(count);
        System.out.println(mxCount);
    }
}
