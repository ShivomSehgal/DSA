import java.util.Arrays;

public class InsertionSort {
    public static int[] Is(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i-1;
            int element=arr[i];
            while(j>=0 && arr[j]>element){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        return arr;
    }
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        int[] A=Is(arr);
        System.out.println(Arrays.toString(A));
    }
}
