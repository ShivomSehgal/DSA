import java.util.Arrays;

public class ZeroSort {
    public static void main(String[] args) {
    int[] arr={0,1,0,2,1,0};
    System.out.println(Arrays.toString(sortt(arr, 6)));

    }

    public static int[] sortt(int[] arr, int n){
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<=n-1;i++){
            if(arr[i]==0){
                zeros++;
            }else if(arr[i]==1){
                ones++;
            }else{
                twos++;
            }
        }
        int j=0;
        while(zeros!=0){
            arr[j]=0;
            j++;
            zeros--;
        }
        while(ones!=0){
            arr[j]=1;
            j++;
            ones--;
        }
        while(twos!=0){
            arr[j]=2;
            j++;
            twos--;
        }
        return arr;
    }
}
