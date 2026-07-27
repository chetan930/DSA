package arrays;

import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,2,2,2,3,3};
        int n=arr.length;
//        int indx=0;
//        HashSet<Integer> set=new HashSet<>();
//        for(int num:arr){
//            if(!set.contains(num)){
//                set.add(num);
//                arr[indx++]=num;
//            }
//        }
//        System.out.println(indx);

        checkDuplicate(arr,n);
        for (int a:arr){
            System.out.print(a+" ");
        }
    }

   static void checkDuplicate(int arr[],int n){
        int i=0,j=1;
        while(j<n){
            if(arr[i]!=arr[j]){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
            j++;


        }
   }
}
