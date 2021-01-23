import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        quicksort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

   public static void quicksort(int[] arr, int p, int r){
      if(p<r){
           int q=partion(arr,p,r);
           quicksort(arr, p, q-1);
           quicksort(arr, q+1, r);
       }
   }
   public static int partion(int[] arr, int p, int r){
       int pivot=arr[r];
       int j=p-1;
       for(int i=p;i<=r-1;i++){
           
           if(arr[i]<=pivot){
               j++;
               int temp=arr[j];
               arr[j]=arr[i];
               arr[i]=temp;
           }
        }
       int tempe=arr[j+1];
       arr[r]=tempe;
       arr[j+1]=pivot;
       return j+1;}
    
      
}
