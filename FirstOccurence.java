import java.util.Arrays;

public class FirstOccurence {
    public static void main(String[] args) {
        int[] arr={1,3,5,5,5,5,67,123,125};
        System.out.println(Arrays.toString(occ(arr, 5,9)) );
    }
    public static int[] occ(int[] arr,int k, int n){
        int start=0;
        int end=0;
        for(int i=0;i<n;i++){
        if(arr[i]==k){
            start=i;
        }
        }
        for(int j=n-1;j>0;j--){
            if(arr[j]==k){
                end=j;
            }
        }
        int[] temp={end,start};
        return temp;
    }
}
