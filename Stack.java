public class Stack {

    private int maxsize;
    private int[] stackarray;
    private int top;

    public Stack(int j){
        this.maxsize=j;
        this.stackarray=new int[maxsize];
        this.top=-1;
    }
    public void push(int num){
        top++;
        stackarray[top]=num;
    }
    public int pop(){
        int temp=top;
        top--;
        return stackarray[temp];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==maxsize-1;
    }
    public int peekFront(){
        return stackarray[top];
    }
    
}
