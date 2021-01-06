public class MaximumContiguousSubarray {
    public static int kadenalgo(int[] arr){
        int maximumsofar, maxendinghere;
        maxendinghere=arr[0];
        maximumsofar=arr[0];
        for(int i=1;i<arr.length;i++){
            maxendinghere=Math.max(arr[i],arr[i]+maxendinghere);
            maximumsofar=Math.max(maxendinghere,maximumsofar);
        }
        return maximumsofar;
    }
    public static void main(String[] args){
        int[] arr={1,2,3,-2,5};
        System.out.println(kadenalgo(arr));
    }
    
}
