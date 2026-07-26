package Hashing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HighOrLowFreqOfEleInArray {
    public static void main(String[] args) {
//        int arr[]={10,5,10,15,10,5};
        int arr[]={2,2,3,4,4,2};
        findHighLowFreq(arr,arr.length);
        findHighLowFreqOptimise(arr,arr.length);
    }

    public static void findHighLowFreq(int arr[],int n){
        boolean vis[]=new boolean[n];
        int lowCount=Integer.MAX_VALUE,highCount=Integer.MIN_VALUE;
        int lowEl=arr[0],highEL=arr[0];
        for (int i = 0; i < n; i++) {
            if(vis[i]) continue;

            int count=1;
            for (int j = i+1; j <n; j++) {
                if(arr[i]==arr[j]){
                    count++;
                    vis[j]=true;
                }
            }

//            lowCount=Math.min(lowCount,count);
//            highCount=Math.max(highCount,count);

            if(count<lowCount){
                lowCount=count;
                lowEl=arr[i];
            }
            if(count>highCount){
                highCount=count;
                highEL=arr[i];
            }
        }

        System.out.println(highEL);
        System.out.println(lowEl);
    }

    public static void findHighLowFreqOptimise(int arr[],int n){
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        int minCount=Integer.MAX_VALUE;
        int maxCount=Integer.MIN_VALUE;

        int maxEl=arr[0];
        int minEl=arr[0];

        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int el=entry.getKey();
            int count=entry.getValue();

            if(count<minCount){
                minCount=count;
                minEl=entry.getKey();
            }

            if (count>maxCount){
                maxCount=count;
                maxEl= entry.getKey();
            }
        }

        System.out.println(maxEl+" "+ minEl);
    }
}
