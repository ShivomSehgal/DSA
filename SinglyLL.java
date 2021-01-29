public class SinglyLL {
   private Node first;
    
    public SinglyLL(){
        
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node newNode=new Node();
        newNode.data=data;
        newNode.next=first;
        first=newNode;
    }
    public void displayList(){
        Node temp=first;
        
        while(temp !=null){
           temp.displayNode();
            temp=temp.next;
        }
        System.out.println();
        
    }
    public void insertLast(int x){
        Node temp=first;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node newNode=new Node();
        newNode.data=x;
        temp.next=newNode;
    } 
    
}
