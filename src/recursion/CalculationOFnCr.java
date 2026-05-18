package recursion;

public class CalculationOFnCr {
//    nCr = n!/(n-r)!r! = n-1Cr-1 + n-1Cr
    public static void main(String[] args) {
        int n=5,r=3;
        System.out.println(nCr(n,r));;
    }

    static int nCr(int n, int r){
        if(n==r || r==0) return 1;
        return nCr(n-1,r-1) + nCr(n-1,r);
    }
}
