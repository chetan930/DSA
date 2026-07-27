package arrays;

public class FindNumberThatAppearsOnce {
    public static void main(String[] args) {
        int arr[]={4,1,2,1,2,4,5};

        for (int i = 0; i < arr.length; i++) {
            boolean flag=false;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    flag=true;
                }
            }
            if(flag==false){
                System.out.println(arr[i]);
                break;
            }else{
                flag=false;
            }
        }
    }
}
