public class DoublyLL {
    private Node first;
    private Node last;
    private Node previous;

    public DoublyLL(){
        this.first=null;
        this.last=null;
        this.previous=null;
    }

    public boolean isEmpty(){
        return first==null;
    }

    public void insertFirst(int data){
        Node x1=new Node();
        x1.data=data;

        if(first==null){
            last=x1;
        }else{
            first.previous=x1;

        }
        x1.next=first;
        first=x1;

    }
    public void insertLast(int data){
        Node x2=new Node();
        x2.data=data;
        if(isEmpty()){
            first=x2;
        }else{
            last.next=x2;
            x2.previous=last;
        }
        last=x2;
    }
    public Node deleteFirst(){
        Node temp=first;
        if(first.next==null){
            last=null;
        }else{
            first.next.previous=null;
        }
        first=first.next;
        return temp;
    }
    public Node deleteLast(){
        Node temp=last;
        if(first.next==null){
            first=null;
        }else{
            last.previous.next=null;
        }
        last=last.previous;
        return temp;
    }

    public boolean insertAfter(int key, int data){
        Node current=first;
        while(current.data !=key){
            current=current.next;
            if(current==null){
                return false;
            }
        }
        Node xox=new Node();
        xox.data=data;
        if(current==last){
            current.next=null;
            last=xox;


        }else{
            xox.next=current.next;
            current.next.previous=xox;
        }
        current.next=xox;
        xox.previous=current;

        return true;

    }

    public Node deleteKey(int key){
        Node current=first;
        while(current.data !=key){
            current=current.next;
            if(current==null){
                return null;
            }
        }
        if(current==first){
            first=current.next;
            
        }else{
            current.next.previous=current.previous;
        }
        return current;
    }
    public void displayFirst(){
        Node current=first;
        while(current != null){
            current.displayNode();
            current=current.next;
        }
        System.out.println();
    }
    public void displayLast(){
        Node current=last;
        while(current != null){
            current.displayNode();
            current=current.previous;
        }
        System.out.println();
    }


    
}
