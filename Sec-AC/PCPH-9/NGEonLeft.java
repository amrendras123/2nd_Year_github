import java.util.Stack;

public class NGEonLeft {
    
    public static void ngeonLeft(int[] arr){
         
       Stack<Integer> st=new Stack<>();
       int[] ans=new int[arr.length];
    //    Arrays.fill(ans, -1);

       for(int i=arr.length-1;i>=0;i--){

        while (!st.isEmpty()&&arr[i]>arr[st.peek()]) {
            ans[st.peek()]=arr[i];
            st.pop();
        }
        st.push(i);
       }
       while(!st.isEmpty()){
        ans[st.peek()]=-1;
        st.pop();
       }
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]+"->"+ans[i]);
       }
    
    }
}
