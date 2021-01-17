import java.util.Arrays;

public class SelectionSort{
    public static int[] ss(int[] arr){
        for(int i=0;i<arr.length;i++){
            int mini=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[mini]){
                    mini=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[mini];
            arr[mini]=temp;
        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        int[] A=ss(arr);
        System.out.println(Arrays.toString(A));
    }
}