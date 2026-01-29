public class PowerTail {
    public static void main(String[] args) {
        
        int x=2;
        int n=5;
        int ans=1;
       System.out.println(pow(x,n,ans));
    }
    public static int pow(int x,int n,int ans){

        if(n==0){
            return ans;
        }
        return pow(x, n-1, x*ans);
    }
}
