import java.util.Arrays;
import java.util.Collections;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={7,10,4,20,15};              
        System.out.println(smallet(arr, 4));
    }

    public static int smallet(int[] arr, int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
}
