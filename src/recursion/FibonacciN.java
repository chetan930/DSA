package recursion;

public class FibonacciN {
    public static void main(String[] args) {
//        find nth fibonacci number
        System.out.println(fibOfN(6));
    }

    static int fibOfN(int n){
        if(n<=1) return n;

        return fibOfN(n-1)+fibOfN(n-2);
    }
}
