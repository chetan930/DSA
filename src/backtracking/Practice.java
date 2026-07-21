package backtracking;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        int mat[][]={{1,1,1,0},
                {1,0,0,1},
                {1,1,0,0},
                {1,1,1,1}};

        int n=mat.length;
        int m=mat[0].length;

        boolean vis[][]=new boolean[n][m];
        vis[0][0]=true;

//        ratInMaze(mat,n,m,0,0,"",vis);



        int arr[]={1,2,3};
        permute(arr,0,arr.length-1);


        // keypad problem

        String input="23";
        String map[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        ArrayList<String> ans=new ArrayList<>();
        keypadProblem(input,map,ans,0,"");
        System.out.println(ans);


        //Knights tour
        int a[][]=knightsTour(5);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(a[j]+" ");
            }
            System.out.println();
        }
    }

    static boolean isValid(int mat[][],int n,int m,int i,int j,boolean vis[][]){
        return i<n && i>=0 && j<m && j>=0 && mat[i][j]==1 && !vis[i][j];
    }

    static void ratInMaze(int mat[][],int n,int m,int i,int j,String path, boolean vis[][]){
        if(i==n-1 && j==m-1){
            System.out.println(path);
            return;
        }


        if(isValid(mat,n,m,i+1,j,vis)){//D
            vis[i+1][j]=true;
            ratInMaze(mat,n,m,i+1,j,path+'D',vis);
            vis[i+1][j]=false;
        }

        if(isValid(mat,n,m,i,j-1,vis)){//L
            vis[i][j-1]=true;
            ratInMaze(mat,n,m,i,j-1,path+'L',vis);
            vis[i][j-1]=false;
        }
        if(isValid(mat,n,m,i,j+1,vis)){//R
            vis[i][j+1]=true;
            ratInMaze(mat,n,m,i,j+1,path+'R',vis);
            vis[i][j+1]=false;
        }

        if(isValid(mat,n,m,i-11,j,vis)){//U
            vis[i-1][j]=true;
            ratInMaze(mat,n,m,i-11,j,path+'U',vis);
            vis[i-1][j]=false;
        }


    }


    static void permute(int arr[],int l,int r){
        if(l==r){
            printArray(arr);
            return;
        }


        for (int i=l;i<=r;i++){
            swap(arr,i,l);
            permute(arr,l+1,r);
            swap(arr,i,l);// backtrack
        }


    }

    static void printArray(int arr[]){
        for (int a:arr){
            System.out.print(a);
        }
        System.out.println();
    }

    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


    static void keypadProblem(String input, String[] map,ArrayList<String> ans, int index, String curr){
        if(index==input.length()){
            ans.add(curr);
            return;
        }

        int keypadNumber=input.charAt(index)-'0';
        String keypadString=map[keypadNumber];

        for (int i = 0; i < keypadString.length(); i++) {
            keypadProblem(input,map,ans,index+1,curr+keypadString.charAt(i));
        }
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
        knightsTourHepler(n,a,moveX,moveY,0,0,1);
        return a;
    }

    static boolean knightsTourHepler(int n,int a[][],int moveX[],int moveY[],int currX,int currY,int step){
        if(step==n*n){
            return true;
        }

        for (int i = 0; i <8; i++) {
            int nextX=currX+moveX[i];
            int nextY=currY+moveY[i];

            if(isValid(n,a,nextX,nextY)){
                a[nextX][nextY]=step;
                boolean isTourCompleted= knightsTourHepler(n,a,moveX,moveY,nextX,nextY,step+1);
                if(isTourCompleted){
                    return true;
                }else{
                    a[nextX][nextY]=-1;
                }
            }


        }

        return false;
    }

    static boolean isValid(int n, int arr[][],int x,int y){
        return x>=0 && y>=0 && x<n && y<n && arr[x][y]==-1;
    }
}
