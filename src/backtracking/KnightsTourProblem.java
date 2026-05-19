package backtracking;

public class KnightsTourProblem {
    public static void main(String[] args) {

    }

    static int[][] knightsTour(int n){
        int a[][]=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]=-1;
            }
        }

        a[0][0]=0;
        int moveX[]={2,1,-1,-2,-2,-1,1,2};
        int moveY[]={1,2,2,1,-1,-2,-2,-1};

        knightsTourHelper(n,a,moveX,moveY,0,0,1);

        return a;
    }

    private static boolean knightsTourHelper(int n, int[][] a, int[] moveX, int[] moveY, int currX, int currY, int step) {
        if(step==n*n) return true;

        for (int i = 0; i <8; i++) {
            int nextX=currX+moveX[i];
            int nextY=currY+moveY[i];

            if(isValid(n,a,nextX,nextY)){
                a[nextX][nextY]=step;
                boolean isTourCompletedByGoingThere=knightsTourHelper(n,a,moveX,moveY,nextX,nextY,step+1);
                if(isTourCompletedByGoingThere){
                    return true;
                }else {
                    a[nextX][nextY]=-1;
                }
            }
        }
    }

    private static boolean isValid(int n, int[][] a, int x, int y) {
        return x>=0 && y>=0 && x<n && y<n && a[x][y]==-1;
    }
}
