package Hashing;

import java.util.HashMap;

public class CountFrequencyOfElementInArray {
    public static void main(String[] args) {
//        int arr[]={10,5,10,15,10,5};
        int arr[]={2,2,3,4,4,2};
        CountFrequencyOfElementInArray freq=new CountFrequencyOfElementInArray();
        freq.countFrequency(arr,arr.length);

        freq.countFrequencyOptimise(arr,arr.length);
    }

    public void countFrequency(int arr[],int n){

        boolean vis[]=new boolean[n];

        for (int i = 0; i < n; i++) {
            if(vis[i]) continue;

            int count=1;

            for (int j = i+1; j < n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    vis[j]=true;
                }
            }

            System.out.println(count);
        }
    }

    public void countFrequencyOptimise(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        int count;
        for (int i = 0; i < n; i++) {
//            count=1;
//            if(map.containsKey(arr[i])){
//                count=map.get(arr[i]);
//                count+=1;
//
//            }
//
//            map.put(arr[i],count);

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }


        System.out.println(map);
    }

}
