import java.util.Arrays;

public class StringPalindrome {
    public static boolean palindrome(String str){
        char[] arr=str.toCharArray();
        Stackchar obj=new Stackchar(arr.length);
        for(int i=0;i<arr.length;i++){
            obj.push(arr[i]);
        }
        char[] duplicate=new char[arr.length];
        for(int i=0;i<duplicate.length;i++){
            duplicate[i]=obj.pop();
        }
        /*for(int i=0;i<duplicate.length;i++){
            if(arr[i]==duplicate[i]){
                System.out.println("It is a Palindrome");
            }else{
                System.out.println("It is not a Palindrome");
            }
        }*/
        return Arrays.equals(arr, duplicate);
    }

    public static void main(String[] args){
       System.out.println(palindrome("123321"));
    }
    
}
