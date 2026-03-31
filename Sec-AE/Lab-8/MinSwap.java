import java.util.Stack;

public class MinSwap {
     public int minSwaps(String s) {
         Stack<Character> st=new Stack<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()||ch=='['){
                st.push(ch);
            }else if(ch==']'&&st.peek()=='['){
              st.pop();  
            }else{
                st.push(ch);
            }
         }
         int pair=st.size()/2;
         return (pair+1)/2;
    }
}
