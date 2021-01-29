public class BST {
    private Node root;

    public void insert(int key, String value){
        Node x1=new Node(key,value);

        if(root==null){
            root=x1;
        }else{
            Node current=root;
            Node parent;

            while(true){
                parent=current;
                if(key<current.key){
                    current=current.leftchild;
                    if(current ==null){
                        parent.leftchild=x1;
                        return;
                    }
                    
                }else{
                    current=current.rightchild;
                    if(current==null){
                        parent.rightchild=x1;
                        return;
                    }
                }
            }
        }
    }

    public Node findMin(){
        Node current=root;
        Node last=null;
        while(current != null){
            last=current;
            current=current.leftchild;
        }
        return last;
    }
    public Node findMax(){
        Node current=root;
        Node last=null;
        while(current != null){
            last=current;
            current=current.rightchild;
        }
        return last;
    }
    public boolean remove(int key){
        Node currentNode=root;
        Node parentNode=root;

        boolean isLeftchild=false;
        while(currentNode.key !=key){
            parentNode=currentNode;
            if(key<currentNode.key){
                isLeftchild=true;
                currentNode=currentNode.leftchild;
            }else{
                isLeftchild=false;
                currentNode=currentNode.rightchild;
            }
            if(currentNode == null){
                return false;
            }
        }
        Node nodetodelete=currentNode;
        //if Node is a leaf
        if(nodetodelete.leftchild==null && nodetodelete.rightchild==null){
            if(nodetodelete==root){
                root=null;
            }else if(isLeftchild){
                parentNode.leftchild=null;
            }else{
                parentNode.rightchild=null;
            }
        }
        //
        else if(nodetodelete.rightchild==null){
            if(nodetodelete==root){
                root=nodetodelete.leftchild;
            }else if(isLeftchild){
                parentNode.leftchild= nodetodelete.leftchild;
            }else{
                parentNode.rightchild=nodetodelete.rightchild;
            }
        }
        //
        else if(nodetodelete.leftchild==null){
            if(nodetodelete==root){
                root=nodetodelete.rightchild;

            }else if(isLeftchild){
                parentNode.leftchild=nodetodelete.rightchild;
            }
            else{
                parentNode.rightchild=nodetodelete.rightchild;
            }
        }
        else{
            Node successor=getSuccessor(nodetodelete);
            if(nodetodelete==root){
                root=successor;
            }else if(isLeftchild){
                parentNode.leftchild=successor;
            }else{
                parentNode.rightchild=successor;
            }
            successor.leftchild=nodetodelete.leftchild;
        }
        return true;

    }

    public Node getSuccessor(Node nodetodelete){
        Node successorParent=nodetodelete;
        Node successor=nodetodelete;

        Node current=nodetodelete.rightchild;
        while(current !=null){
            successorParent=successor;
            successor=current;
            current=current.leftchild;
        }
        if(successor!=nodetodelete.rightchild){
            successorParent.leftchild=successor.rightchild;
            successor.rightchild=nodetodelete.rightchild;
        }
        return successor;
    }
    
}
