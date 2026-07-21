package recursion;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        System.out.println(fib(5));

        int n=7;
        System.out.print(0+" ");
        System.out.print(1+" ");
        series(n-2,1,0);


        String str="abdfccdba";
        System.out.println("\n"+checkPalindrome(str,0,str.length()-1));


        ArrayList<String> list=new ArrayList<>();
        printSubsets("abcc","",0,list);
        System.out.println(list);


        System.out.println(power(5,3));
    }

    static int  fib(int n){
        if(n==0 || n==1){
            return n;
        }

        return fib(n-1)+fib(n-2);
    }


    static void series(int n,int last,int secndLast){
        if(n==0) return;

        int curr=last+secndLast;
        System.out.print(curr+" ");
        series(n-1,curr,last);
    }

    static boolean checkPalindrome(String str,int start,int end){
        if(start>=end){
            return true;
        }

        return str.charAt(start)==str.charAt(end) && checkPalindrome(str,start+1,end-1);


    }


    static void printSubsets(String str, String ans, int i,ArrayList<String> list){
        if(i==str.length()){
            if(!list.contains(ans)){
                list.add(ans);
            }
            return ;
        }

        printSubsets(str,ans+str.charAt(i),i+1,list);
        printSubsets(str,ans,i+1,list);
    }

    public static int power(int a,int b){
        if(b==0){
            return 1;
        }

        return a*power(a,b-1);
    }

}
