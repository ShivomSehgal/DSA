public class RecursiveLinearSearch {

    public static int rls(int n,int[] arr,int x){
        if(n>arr.length-1){return-1;}//Base Case
        
        else if(arr[n]==x){
            return n;
        }
        else{
            return rls(n+1, arr, x);//used recursive method
        }
        
    }
    
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(rls(0, arr, 9));
    }
}
