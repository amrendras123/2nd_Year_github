import java.util.Arrays;
import java.util.Stack;

public class NGEonRight {
     
    public static void main(String[] args) {
        int[] arr={8,7,6,5,4,3,2,1};
        ngeonR(arr);
    }
    
    public static void ngeonR(int[] arr){
       Stack<Integer> st=new Stack<>();
       int[] ans=new int[arr.length];
    //    Arrays.fill(ans, -1);
       for(int i=0;i<arr.length;i++){

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