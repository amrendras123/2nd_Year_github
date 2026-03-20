import java.util.Stack;

class NGEonRight{

    public static void main(String[] args) {
        int[] arr={4,3,2,4,5,6,78,98,7,6,5,4,10,3,3,2};
        ngeonR(arr);
    }
    public static void ngeonR(int[] arr){
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){ 
            while(!st.isEmpty()&&arr[i]>arr[st.peek()]){
                ans[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=-1;
            st.pop();
        }
        for(int i=0;i<ans.length;i++){
            System.out.println(arr[i]+"->"+ans[i]);
        }

    }
}