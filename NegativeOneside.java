import java.util.Arrays;

public class NegativeOneside {

    public static int[] negtv(int[] arr){
        int n=arr.length;
        for(int i=0;i<=n/2;i++){
            for(int j=n-1;j>n/2;j--){
                if(arr[i]>0||arr[j]<0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    } 
    public static void main(String[] args){
        int[] arr={-12,11,-13,-5,6,-7,5,-3,-6};
        int[] arr1=negtv(arr);
        System.out.println(Arrays.toString(arr1));
    }    
}
