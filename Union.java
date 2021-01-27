public class Union {

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int[] b={1,2,3,6};
        System.out.println(unionn(a, b, 5, 3));
    }

    public static int unionn(int[] arr1, int[] arr2, int n1, int n2){
        int m=Math.max(n1, n2);
        int p=Math.min(n1, n2);
        for(int i=0;i<=p;i++){
            if(arr1[i]!=arr2[i]){
                m++;
            }
        }
        return m;
    }
    
}
