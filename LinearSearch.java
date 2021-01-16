public class LinearSearch {
    public static int ls(int[] arr,int x){
        for(int i=0;i<arr.length;i++){//simply iterate over the entire array
            if(arr[i]==x){return i;}//and check if given integer is present inside the array
        }
        return -1;//else return -1
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7,8,9};
        System.out.println(ls(arr, 8));
    }
}
