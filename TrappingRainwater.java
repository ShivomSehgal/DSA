public class TrappingRainwater {
    public static int rain(int n, int[] arr){
        int level=arr[0];
        int rainwater=0;
        for(int i=1;i<n;i++){
            int temp=level-arr[i];
            if(temp>0){
                rainwater+=temp;
            }
        }
        return rainwater;
    }
    public static void main(String[] args){
        int[] arr={3,0,0,2,0,4};
        System.out.println(rain(6,arr));
    }
}
