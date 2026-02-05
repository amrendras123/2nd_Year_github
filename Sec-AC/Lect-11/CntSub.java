public class CntSub {
    public static void main(String[] args) {
        String ques="abcdjkfsfsdfjsdfkcsdk";
        String ans="";
        System.out.println(cnt(ques,ans));
    }
    public static int cnt(String q,String a){
      if(q.length()==0){
        System.out.println(a);
        return 1;
      }
       char ch=q.charAt(0);
       int c1= cnt(q.substring(1), a);
        int c2=cnt(q.substring(1), a+ch);
        return c1+c2;
    }
}
