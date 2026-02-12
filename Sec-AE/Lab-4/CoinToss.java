public class CoinToss {
    public static void main(String[] args) {
        int n=3;
        String ans="";
        coin(n,ans);
    }
    public static void coin(int n,String ans){
        if(n==0){//bc
            System.out.println(ans);
            return ;
        }
        coin(n-1, ans+"H");//sp
        coin(n-1, ans+"T");//sp
    }
}
