class MazePath{
    public static void main(String[] args) {
        int n=10;
        String ans="";
        maze(n,ans);
    }
    public static void maze(int n, String ans){
        if(n<0){//-ve base case
            return ;
        }
        if(n==0){//+ve base case
            System.out.println(ans);
            return ;
        }
        maze(n-1, ans+"1");
        maze(n-2, ans+"2");
        maze(n-3, ans+"3");
        maze(n-4, ans+"4");
        maze(n-5, ans+"5");
        maze(n-6, ans+"6");
    }
}