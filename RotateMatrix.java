import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RotateMatrix{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> a= new ArrayList();
        ArrayList<Integer> a1=new ArrayList<>(Arrays.asList(1,2,3));
        ArrayList<Integer> a2=new ArrayList<>(Arrays.asList(4,5,6));
        ArrayList<Integer> a3=new ArrayList<>(Arrays.asList(7,8,9));
        a.add(a1);
        a.add(a2);
        a.add(a3);
        System.out.println(rotate(a));
    }
    public static ArrayList<ArrayList<Integer>> rotate(ArrayList<ArrayList<Integer>> arr){
        int m=arr.size();
        int n=arr.get(0).size();
        transpose(arr,m,n);
       for(int i=0; i<m;i++){
            Collections.reverse(arr.get(i));

        }
        return arr;
        
    }
    public static void transpose(ArrayList<ArrayList<Integer>> arr, int m, int n){
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr.get(i).get(j);
                arr.get(i).set(j,arr.get(j).get(i));
                arr.get(j).set(i, temp);
            }
        }
    }
}