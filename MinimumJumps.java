public class MinimumJumps {
    public static void main(String[] args) {
        int[] arr={1,3,5,8,92,6,7,6,8,9};
        System.out.println(jump(arr, 11));
    }

    public static int jump(int[] arr, int n){
        int i=0;
        int temp=0;
        for(int j=arr[i];j<n;j+=i){
         i+=j;
         if(j==n-1){
             return temp;
         } else{
         temp++;}
        }
        return temp;
          

       }
       
    }

