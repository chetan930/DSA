package backtracking;

public class RatInMaze {
    public static void main(String[] args) {

        int mat[][]={{1,1,1,0},
            {1,0,0,1},
            {1,1,0,0},
            {1,1,1,1},
        };

        int m=mat.length;
        int n=mat[0].length;

        boolean vis[][]=new boolean[m][n];
        vis[0][0]=true;

        ratInMaze(mat,m,n,vis,0,0,"");


    }


    static boolean isValid(int i,int j, int m, int n, int mat[][], boolean vis[][]){
        if(i<m && i>=0 && j<n &&j>=0 && mat[i][j]==1 && vis[i][j]==false){
            return true;
        }

        return false;
    }


//    direction DLRU

    public static void ratInMaze(int mat[][], int m, int n, boolean vis[][],int i,int j, String path){
        if(i==m-1 && j==n-1){
            System.out.println(path);
            return;
        }

        if(isValid(i+1,j,m,n,mat,vis)){//D
            vis[i+1][j]=true;
            ratInMaze(mat,m,n,vis,i+1,j,path+'D');
            vis[i+1][j]=false;
        }

        if(isValid(i,j-1,m,n,mat,vis)){//L
            vis[i][j-1]=true;
            ratInMaze(mat,m,n,vis,i,j-1,path+'L');
            vis[i][j-1]=false;
        }

        if(isValid(i,j+1,m,n,mat,vis)){//R
            vis[i][j+1]=true;
            ratInMaze(mat,m,n,vis,i,j+1,path+'R');
            vis[i][j+1]=false;
        }

        if(isValid(i-1,j,m,n,mat,vis)){//U
            vis[i-1][j]=true;
            ratInMaze(mat,m,n,vis,i-1,j,path+'U');
            vis[i-1][j]=false;
        }


    }
}
