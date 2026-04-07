import java.util.Stack;

public class QueueUsingStack {
    
    class MyQueue {
     Stack<Integer> in;
     Stack<Integer> ot;
    public MyQueue() {
        this.in=new Stack<>();
        this.ot=new Stack<>();
    }
    
    public void push(int x) {//O(1)
        in.push(x);
    }
    public int pop() {//O(n)
        peek();
        return ot.pop();
    }
    public int peek() {//O(n)
        if(ot.isEmpty()){
            while(!in.isEmpty()){
                ot.push(in.pop());
            }
        }
        return ot.peek();
    }  
    public boolean empty() {//O(1)
        return in.isEmpty()&&ot.isEmpty();
    }
}
}
