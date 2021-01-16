public class RecursiveBinarySearch {
    
    public static int rbs(int p,int r,int[] arr,int x){
        if(p>r){
         return -1;
        }      
        else{int q=(p+r)/2;
        if(arr[q]==x){
            return q;
        }
        else if(arr[q]>x){
            return rbs(p, q-1, arr, x);
        }
        else if(arr[q]<x){
            return rbs(q+1, r, arr, x);
        }
        else{
            return -1;
        }
    }
    
    }
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(rbs(0, 8, arr, 8));
    }
}
