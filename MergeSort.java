import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args){
        int[] arr={9,8,7,6,5,4,3,2,1};
        ms(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void ms(int[] arr, int p, int r){

        if(r<=p){
            return;

        }else{
            int q=(p+r)/2;
            ms(arr, p, q);
            ms(arr, q+1, r);
            merge(arr,p,q,r);
        }
        
    }
    public static void merge(int[] arr,int p, int q, int r){

        int k=0;
        int leftslot=p;
        int rightslot=q+1;
        int[] temp=new int[r-p+1];

        while(leftslot<=q && rightslot<=r){
            if(arr[leftslot]<arr[rightslot]){
                temp[k]=arr[leftslot];
                leftslot++;
            }else{
                temp[k]=arr[rightslot];
                rightslot++;
            }
            k++;
        }

            if(leftslot<=q){
                while(leftslot<=q){
                temp[k]=arr[leftslot];
                k++;
                leftslot++;}
            }else if(rightslot<=r){
                while(rightslot<=r){
                temp[k]=arr[rightslot];
                rightslot++;
                k++;}
            }
        

        for(int i=0;i<temp.length;i++){
            arr[p+i]=temp[i];
        }
        
    }
    
    
}
