public class CntCoin {
    public static void main(String[] args) {
        int n=10;
        String ans="";
        System.out.println(coin(n,ans));
    }
    public static int coin(int n,String ans){
        if(n==0){//bc
            // System.out.println(ans);
            return 1;
        }
       int s1= coin(n-1, ans+"H");//sp
       int s2= coin(n-1, ans+"T");//sp
       return s1+s2;//self work
    }
}
