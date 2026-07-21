package arrays;

import java.util.Arrays;

public class WaveArray {
    public static void main(String[] args) {
        int a[]={1,9,5,2,0,7,4,8,3,6};
        Arrays.sort(a);
        for (int i = 0; i < a.length-1;i+=2) {
            swap(a,i,i+1);
        }

        for (int i:a){
            System.out.print(i+" ");
        }
    }

    static void swap(int a[],int i,int j){
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
