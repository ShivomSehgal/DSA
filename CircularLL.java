public class CircularLL {
    private Node first;
    private Node last;
    
    public CircularLL(){
     
    }

    public void insertFirst(int x){
        Node newnode=new Node();
        newnode.data=x;
        if(first==null){
            last=newnode;
        }
        newnode.next=first;
        first=newnode;
    }
    public int deleteFirst(){
        int temp=first.data;
        if(first.next==null){
            last=null;
        }
        first=first.next;
        return temp;
    }
    public void insertLast(int x1){
        Node temp=new Node();
        temp.data=x1;
        if(first==null){
            first=temp;
        }else{
            last.next=temp;
            last=temp;
        }
    }
    public void displayList(){
        Node temp=first;
        while(temp!=null){
            temp.displayNode();
            temp=temp.next;
        }
        System.out.println();
    }
}
