import java.util.Stack;

public class NGEonRight {
    public int[] ngeonR(int[] arr) {
        Stack<Integer> st=new Stack<>();

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;
    }
}
