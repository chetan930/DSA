package arrays;

import java.util.*;

public class UnionOfTwoSortedArray {
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={2,3,4,4,5,8,9};
        findUnion(arr1,arr2);
    }


//    static void findUnion(int arr1[],int arr2[]){
//        HashSet<Integer> set=new HashSet<>();
//        ArrayList<Integer> ls=new ArrayList<>();
//        int n=arr1.length;
//        int m=arr2.length;
//        for (int i = 0; i < n; i++) {
//            if(!set.contains(arr1[i])){
//                set.add(arr1[i]);
//            }
//        }
//
//        for (int i = 0; i < m; i++) {
//            if(!set.contains(arr2[i])){
//                set.add(arr2[i]);
//            }
//        }
//
//        Iterator<Integer> it= set.iterator();
//        while(it.hasNext()){
//            ls.add(it.next());
//        }
//
//        System.out.println(ls);
//        Collections.sort(ls);
//        System.out.println(ls);
//
//
//    }


//    static void findUnion(int arr1[],int arr2[]){
//        HashMap<Integer,Integer> mp=new HashMap<>();
//        int n=arr1.length;
//        int m=arr2.length;
//        int idx=0;
//        for (int i = 0; i < n; i++) {
//            if(!mp.containsValue(arr1[i])){
//                mp.putIfAbsent(idx++,arr1[i]);
//            }
//
//        }
//        for (int i = 0; i < m; i++) {
//            if(!mp.containsValue(arr2[i])){
//                mp.putIfAbsent(idx++,arr2[i]);
//            }
//        }
//
//
//        ArrayList<Integer> ls=new ArrayList<>();
//        for (int i = 0; i < idx; i++) {
//            ls.add(mp.get(i));
//        }
//
//        System.out.println(ls);
//    }

    static void findUnion(int arr1[],int arr2[]){
        int n=arr1.length;
        int m=arr2.length;
        int i=0;int j=0;
        ArrayList<Integer> ls=new ArrayList<>();
        while(i<n && j< m){
            if(arr1[i]<arr2[j] && (ls.isEmpty() || ls.getLast()!=arr1[j])){
                ls.add(arr1[i]);
                i++;
            }else if(arr2[j]>arr1[i] && (ls.isEmpty() || ls.getLast()!=arr2[j])){
                ls.add(arr2[i]);
                j++;
            }else {
                ls.add(arr1[i]);
                i++;
                j++;
            }
        }

        while (i<n){
            if(ls.getLast()!=arr1[i]){
                ls.add(arr1[i]);
                i++;
            }
        }

        while (j<m){
            if(ls.getLast()!=arr2[j]){
                ls.add(arr2[j]);
                j++;
            }
        }

        System.out.println(ls);
    }
}
