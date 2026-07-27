package arrays;

public class LeftRotateArray {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6};
        leftRotate(nums,nums.length);

        for (int a:nums){
            System.out.print(a+" ");
        }
    }

    static void leftRotate(int nums[],int n){

        int temp=nums[0];
        for (int i = 1; i < n; i++) {
            nums[i-1]=nums[i];
        }

        nums[n-1]=temp;
    }
}
