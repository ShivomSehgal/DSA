import java.util.ArrayList;
import java.util.Arrays;

/*Find the max-min in an array with minimum number of comparisons 
*/
public class MaxMin {

    public static int[] maxe(ArrayList<Integer> A){
        int[] arr=new int[2];
        int min=A.get(0);
        int max=A.get(0);
        for(int i=1;i<A.size();i++){
            min=Math.min(min, A.get(i));
            max=Math.max(max,A.get(i));
        }
        arr[0]=min;
        arr[1]=max;
        return arr;
    }

    public static void main(String[] args){
        ArrayList<Integer> arr=new ArrayList(Arrays.asList(1,4,8,6,9,7,3,4));
        System.out.println(Arrays.toString(maxe(arr)));
    }

    
}
