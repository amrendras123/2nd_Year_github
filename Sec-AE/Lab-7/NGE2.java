class NGE2{
      public int[] nextGreaterElements(int[] nums) {

       int[] ans=new int[nums.length];
       Arrays.fill(ans,-1);
       Stack<Integer> st=new Stack<>();
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
       return ans; 
    }
}