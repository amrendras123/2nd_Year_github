public class MainStack {
    public static void main(String[] args) throws Exception {
        Stack st=new Stack(1000);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.push(60);
        st.display();
        // st.push(20);
        System.out.println(st.peek());

    }
}
