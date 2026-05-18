package recursion;

public class SumOfNatural {
    public static void main(String[] args) {
        System.out.println(sumOfNaturalNumber(5));


    }

    static int sumOfNaturalNumber(int n){
        if(n==1){
            return 1;
        }
        return n+sumOfNaturalNumber(n-1);

    }
}
