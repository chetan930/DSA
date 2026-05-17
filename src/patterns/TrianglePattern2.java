package patterns;

public class TrianglePattern2 {
    public static void main(String[] args) {
        int n=6;
        for (int i = 1; i <= n; i++) {

            for (int j = 0; j <=n-i ; j++) {
                System.out.print(" ");
            }

            int curr=i;
            for (int j = 1; j <= i; j++) {
                System.out.print(curr--);
            }

            for (int j = 2; j <=i ; j++) {
                System.out.print(j);
            }

            System.out.println();

        }
    }
}
