import java.util.Stack;

public class NextGreaterEle2 {
      public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            while(!st.isEmpty()&&nums[i]>nums[st.peek()]){
                ans[st.peek()]=nums[i];
                st.pop();
            }
            st.push(i);
        }
         for(int i=0;i<nums.length;i++){
            while(!st.isEmpty()&&nums[i]>nums[st.peek()]){
                ans[st.peek()]=nums[i];
                st.pop();
            }
        }
        while(!st.isEmpty()){
            ans[st.pop()]=-1;
        }
        return ans;

    }
}
