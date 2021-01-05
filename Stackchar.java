public class Stackchar {

    

        private int maxsize;
        private char[] stackarray;
        private int top;
    
        public Stackchar(int j){
            this.maxsize=j;
            this.stackarray=new char[maxsize];
            this.top=-1;
        }
        public void push(char num){
            top++;
            stackarray[top]=num;
        }
        public char pop(){
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
    
    

