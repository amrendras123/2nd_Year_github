import java.util.Stack;

class LongestValid{
      public int longestValidParentheses(String s) {
         Stack<Integer> st=new Stack<>();
         for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()||ch=='('){
                st.push(i);
            }else if(ch==')'&&s.charAt(st.peek())=='('){
              st.pop();  
            }else{
                st.push(i);
            }
         } 
         if(st.isEmpty()){
            return s.length();
         }
         int max=s.length()-st.peek()-1;
         int n=s.length();
         while(!st.isEmpty()){
            int val=st.pop();
            int val1=st.isEmpty()?0:st.peek();
            max=Math.max(max,val-val1-1);
         }
         return max;
    }
}