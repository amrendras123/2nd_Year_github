public class CntSub {
     public static void main(String[] args) {
        String q="abcdejadfaefadfksafksaffghij";
        String ans="";
       System.out.println(sub(q,ans));
    }
    public static int sub(String q,String ans){
        if(q.length()==0){//bc
            System.out.println(ans);
            return 1;
        }
        char ch=q.charAt(0);
       int s1= sub(q.substring(1) ,ans);//sp
       int s2= sub(q.substring(1), ans+ch);//sp
       return s1+s2;
    }
}
