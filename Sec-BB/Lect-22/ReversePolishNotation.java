import java.util.Stack;

public class ReversePolishNotation {
     public int evalRPN(String[] s) {
        
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<s.length;i++){

            switch(s[i]){

                case "+":
                st.push(st.pop()+st.pop());
                break;
                case "-":
                st.push(-st.pop()+st.pop());
                break;
                case "*":
                st.push(st.pop()*st.pop());
                break;
                case "/":
                int n1=st.pop(),n2=st.pop();
                st.push(n2/n1);
                break;
                default:
                st.push(Integer.parseInt(s[i]));
            }
        }
        return st.pop();
    }
}
