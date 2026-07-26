package Maths;

public class ReverseNumber {

//    Reverse Digits of A Number
//    Problem Statement: Given an integer N return the reverse of the given number.
//    Note: If a number has trailing zeros, then its reverse will not include them. For e.g , reverse of 10400 will be 401 instead of 00401.


    public static void main(String[] args) {
        int num=12345;
        int newNum=0;
        while(num>0){
            newNum=newNum*10+(num%10);
            num=num/10;
        }

        System.out.println(newNum);
    }
}
