package arrays;

import java.util.HashMap;

public class FindNumberThatAppearsOnce {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2,5,6,4,5,};
        int n=arr.length;

//        HashMap<Integer,Integer> mp=new HashMap<>();
//        for (int i = 0; i < n; i++) {
//            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
//        }
//
//        for(int key:mp.keySet()){
//           if(mp.get(key)==1) {
//               System.out.println(key);
//               break;
//           }
//        }

        int xor=0;

        for (int a:arr){
            xor^=a;
        }

        System.out.println(xor);
    }
}
