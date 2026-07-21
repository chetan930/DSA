package arrays;

public class MultipleLeftRotationOfArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={2,3};


        optimiseRotate(a,b);

        System.out.println(".........................");

        int ans[][]=new int[b.length][a.length];

        for (int i = 0; i < b.length; i++) {
            int temp[]=a.clone();
            rotateArray(a.length,b[i],temp);
            for (int j=0;j<a.length;j++){
                ans[i][j]=temp[j];
            }
        }
        for (int i = 0; i < b.length; i++) {
            for (int j=0;j<a.length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }


    }

    static void rotateArray(int n,int k,int a[]){
        for (int i = 0; i < k; i++) {
            int temp=a[0];
            for (int j = 0; j < n-1; j++) {
                a[j]=a[j+1];
            }

            a[n-1]=temp;
        }
    }

    static void optimiseRotate(int a[],int b[]){
        int n=a.length;
        int temp[]=new int [2*n];
        for (int i = 0; i < n; i++) {
            temp[i]=a[i];
            temp[n+i]=a[i];
        }

        System.out.println(b.length);

        int ans2[][]=new int[b.length][n];

        for (int i = 0; i < b.length; i++) {

            int k=b[i]%n;


            for (int j = 0; j < n;j++) {
                ans2[i][j]=temp[k+j];
            }
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+" ");
        }
        System.out.println();

        for (int i = 0; i < b.length; i++) {
            for (int j=0;j<n;j++){
                System.out.print(ans2[i][j]+" ");
            }
            System.out.println();
        }

    }
}
