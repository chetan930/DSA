package recursion;

public class PowerWithModulo {
    public static void main(String[] args) {
        System.out.println(power(5,3)); //O(n)

        System.out.println(fastPower(7,7,30));; //O(logn)


    }

    static double power(double a, int b){
        if(b==0) return 1;

        return power(a,b-1)*a;
    }

    static double fastPower(double a, int b,int m){
        if(b==0) return 1;

        //        if b is -ve
        if(b<0) return fastPower(1/a,Math.abs(b),m);

        if(b%2==0){
            return fastPower((a%m *a%m)%m,b/2,m);
        }else{
            return (a % m * fastPower(a,b-1,m) % m ) % m;
        }
    }
}
