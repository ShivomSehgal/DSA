public class BinarySearch {

    public static int bs(int[] arr,int x){
        
        int p=0;
        int r=arr.length-1;
        while(p<=r){
            int q=(p+r)/2;
            if(arr[q]==x){
            return q;}
        else if(arr[q]>x){
            r=q-1;
        }else if(arr[q]<x){
            p=q+1;
        }
    }
        return -1;
    }    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(bs(arr, 10));
    }
}
