public class SearchMatrix {
    public static void main(String[] args) {
        int[][] arr={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchm(arr, 23, 3, 4));
    }

    public static boolean searchm(int[][] arr, int k, int n1, int n2){
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(arr[i][j]==k){
                    return true;
                }
            }
        }
        return false;
    }
}
