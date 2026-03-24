import java.util.Stack;

public class LargestAreaRectangle {

      public int largestRectangleArea(int[] ht) {
        
        Stack<Integer> st=new Stack<>();
        int max=0;
        for(int i=0;i<=ht.length;i++){
            int val=(i==ht.length)?0:ht[i];
            while(!st.isEmpty()&&val<ht[st.peek()]){
                int nsr=i;
                int tbs=st.pop();
                int nsl=st.isEmpty()?-1:st.peek();
                int wdt=nsr-nsl-1;
                 int area=ht[tbs]*wdt;
                 max=Math.max(area,max);
            }
            st.push(i);
        }
        return max;
    }
}