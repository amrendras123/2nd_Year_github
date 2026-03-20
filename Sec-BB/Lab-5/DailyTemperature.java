import java.util.Stack;

public class DailyTemperature {
     public int[] dailyTemperatures(int[] arr) {
        Stack<Integer> st=new Stack<>();

        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){

            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.peek()]=i-st.peek();
                st.pop();
            }
            st.push(i);
        }
        return ans;
    }
}
