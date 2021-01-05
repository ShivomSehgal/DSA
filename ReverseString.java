public class ReverseString {

    public static void main(String[] args){
        String str="HACKER";
               
        char[] arr=str.toCharArray();
        Stackchar obb=new Stackchar(arr.length);
        for(char c:arr){
            obb.push(c);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=obb.pop();
        }
        System.out.println(arr);
        /*int num=ch.length;
        for(int i=0;i<(ch.length/2)-1;i++){
            for(int j=num-1;j>i;j--){
                char c=ch[i];
                ch[i]=ch[j];
                ch[j]=c;
            }

        }
        System.out.println(ch);*/
    }
    
}
