public class Subseq {

    public static void main(String[] args) {
        String q="abc";
        String ans="";
        sub(q,ans);
    }
    public static void sub(String q,String ans){
        if(q.length()==0){//bc
            System.out.println(ans);
            return ;
        }
        char ch=q.charAt(0);
        sub(q.substring(1) ,ans);//sp
        sub(q.substring(1), ans+ch);//sp
    }
}