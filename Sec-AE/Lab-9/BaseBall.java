import java.util.Stack;

public class BaseBall {
     public int calPoints(String[] s) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length;i++){
            switch(s[i]){
                case "+":
                int n1=st.pop(),n2=st.peek();
                st.push(n1);
                st.push(n1+n2);
                break;
                case "C":
                  st.pop();
                  break;
                case "D":
                  st.push(2*st.peek());
                  break;
                default:
                st.push(Integer.parseInt(s[i]));
            }
        }
        int sum=0;
        while(!st.isEmpty()){
            sum+=st.pop();
        }
        return sum;
    }
}
