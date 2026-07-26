package Maths;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number  ");
        int n=sc.nextInt();
        System.out.println(findPrimeNumber(n));;
    }

    static boolean findPrimeNumber(int n){
        if(n==2) return true;
        for (int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }

        }

        return true;
    }
}
