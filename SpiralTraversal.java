import java.util.ArrayList;
import java.util.Arrays;

public class SpiralTraversal {
    public static ArrayList<Integer> spiral(int[][] A,int R, int C){
        ArrayList<Integer> arr=new ArrayList<>();
        int top=0,bottom=R-1;
        int left=0,right=C-1;
        int path=1;
        for(int ii=0;ii<R*C;ii++){
        if(path==1){
            for(int i=left;i<=right;i++){
                arr.add(A[top][i]);
            }
            path=2;
            top++;
        }else if(path==2){
            for(int i=top;i<=bottom;i++){
                //int x=right+i;
                arr.add(A[i][right]);
            }
            path=3;
            right--;
        }
        else if(path==3){
            for(int i=right;i>=left;i--){
                arr.add(A[bottom][i]);
            }
            path=4;
            bottom--;
        }
        else if(path==4){
            for(int i=bottom;i>=top;i--){
                arr.add(A[i][left]);
            }
            left++;
            path=1;
        }
    }
        return arr;
    }
    public static void main(String[] args){
        int[][] arr={{1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16}};
        System.out.println(spiral(arr, 4, 4));
    }
    
}
