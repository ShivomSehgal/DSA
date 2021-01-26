import java.util.Arrays;

public class RotateArray {
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int[] arr1=rotate(arr, 6);
        System.out.println(Arrays.toString(arr1));
    }

    public static int[] rotate(int[] arr, int n){
       int tempe=arr[n-1];
        for(int i=n-1;i>0;i--){

            //int temp=arr[i-1];
            arr[i]=arr[i-1];

        }
        arr[0]=tempe;
        return arr;
    }
}
