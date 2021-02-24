public class HeightBT {
    class Node{
        int value;
        Node left,right;
        public Node(int value){
            this.value=value;
        }
    }
   public int height(Node node){
       if(node==null){
           return 0;
       }
       else{
           int leftheight=height(node.left);
           int rightheight=height(node.right);

           if(leftheight>rightheight)
               return leftheight+1;
           else
               return rightheight+1;
           
       }
   }
}
