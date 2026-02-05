class Dice{
    public static void main(String[] args) {
        int n=20;
        String ans="";
        dice(n,ans);
    }
    public static void dice(int n, String ans){
      if(n==0){
        System.out.println(ans);
        return ;
      }
      if(n<0){
        return ;
      }

        dice(n-1, ans+"1");
        dice(n-2, ans+"2");
        dice(n-3, ans+"3");
        dice(n-4, ans+"4");
        dice(n-5, ans+"5");
        dice(n-6, ans+"6");

    }
}