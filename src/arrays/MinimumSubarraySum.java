package arrays;

public class MinimumSubarraySum {
    public static void main(String[] args) {
        int a[]={1,2,5,6,7,2};
        int k=8;

        int l=0;
        int r=0;
        int x=-1;
        int y=-1;
        int minLength=Integer.MAX_VALUE;
        int currSum=0;
        while(r<a.length){
            currSum+=a[r];
            while (currSum>=k){
//                minLength=Math.min(minLength,r-l+1);
                if(r-l+1<minLength){
                    minLength=r-l+1;
                    x=l;
                    y=r;
                }
                currSum-=a[l];
                l++;
            }
            r++;
        }

        if(minLength==Integer.MAX_VALUE){
            minLength=0;
        }

        System.out.println(minLength);
        System.out.println(".....................");
        System.out.println(x+" "+y);
    }
}
