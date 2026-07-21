package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {
//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5};
//        int b[]={2,3};
//
//        int ans[][]=new int[b.length][a.length];
//
//        for (int i = 0; i < b.length; i++) {
//            int temp[]= a.clone();
//            rotateArray(temp,a.length,b[i]);
//            for (int j = 0; j < a.length; j++) {
//                ans[i][j]=temp[j];
//            }
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//        }
//
//    }
//
//    static void rotateArray(int a[],int n,int k){
//        for (int i = 0; i < k; i++) {
//            int temp=a[0];
//            for (int j = 0; j < n-1; j++) {
//                a[j]=a[j+1];
//            }
//
//            a[n-1]=temp;
//        }
//    }


//    public static void main(String[] args) {
//        int a[]={1,2,3,4,5};
//        int b[]={1,2,3};
//
//        optimiseRotate(a,b);
//    }

//    static void optimiseRotate(int a[],int b[]){
//        int ans[][]=new int [b.length][a.length];
//
//        int temp[]=new int[2*a.length];
//        for (int i = 0; i < a.length; i++) {
//            temp[i]=a[i];
//            temp[a.length+i]=a[i];
//        }
//
//        for (int i = 0; i < temp.length; i++) {
//            System.out.print(temp[i]+" ");
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            int k=b[i]%a.length;
//            for (int j = 0; j < a.length; j++) {
//                ans[i][j]=temp[j+k];
//            }
//        }
//
//        for (int i = 0; i < b.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(ans[i][j]+" ");
//            }
//            System.out.println();
//        }
//    }


//    public static void main(String[] args) {
//        int arr[]={12,9,8,2,11};
//        Arrays.sort(arr);
//        int diff=Integer.MAX_VALUE;
//        for (int i = 0; i < arr.length-1; i++) {
//            diff=Math.min(diff,arr[i+1]-arr[i]);
//        }
//
//
//        List<List<Integer>> ans=new ArrayList<>();
//
//        for (int i = 0; i < arr.length-1; i++) {
//            if(diff==(arr[i+1]-arr[i])){
//                ans.add(Arrays.asList(arr[i],arr[i+1]));
//            }
//        }
//
//        System.out.println(ans);
//    }


    public static void main(String[] args) {
        int a[]={-1,0,1,2,-1,-4};


    }



}
