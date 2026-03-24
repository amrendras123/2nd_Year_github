import java.util.Stack;

public class LargestRectArea {
      public int largestRectangleArea(int[] ht) {
        
      Stack<Integer> st=new Stack<>();
      for(int i=0;i<=ht.length;i++){
          int val=(i==ht.length)?0:ht[i];
        while(!st.isEmpty()&val<ht[st.peek()]){
            int tbs=st.pop();
            int nsr=i;
            int nsl=st.isEmpty()?-1:st.peek();
            int width=nsr-nsl-1;
            int area=ht[tbs]*width;
            max=Math.max(area,max);
        }
        st.push(i);
      }
      return max;
    }
}
