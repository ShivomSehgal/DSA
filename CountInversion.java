public class CountInversion {
    
    public static void main(String[] args) {
        int[] arr={2,4,1,3,5};
        System.out.println(countinv(arr,5));}

        public static int countinv(int[] arr, int n){
            int temp=0;
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]>arr[j]){
                        temp++;
                    }
                }
            }
            return temp;
        }


}