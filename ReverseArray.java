import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args){
        String str="HACKER";
        int[] arr={1,2,3,4,5,6}; 
        
        Stack obb=new Stack(arr.length);
        int[] rev=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            obb.push(arr[i]);
            }
        for(int i=0;i<arr.length;i++){
            rev[i]=obb.pop();
        }
        System.out.println(Arrays.toString(rev));
    }
    
}
