public class MinimiseHeights {
    public static void main(String[] args) {
        int[] arr={3,9,12,16,20};
        System.out.println(height(arr, 5, 3));
        
    }

    public static int height(int[] arr, int n, int k){
        for(int i=0;i<n;i++){
            if(arr[i]<=k){
                arr[i]+=k;
            }else{
                arr[i]-=k;
            }
        }
        return arr[n-1]-arr[0];
    }
}
