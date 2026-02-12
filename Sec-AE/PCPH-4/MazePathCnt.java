public class MazePathCnt {
    public static void main(String[] args) {
         int n=10;
        String ans="";
        System.out.println(maze(n,ans));
    }
    public static int maze(int n, String ans){


        if(n<0){
            return 0;
        }
        if(n==0){
            // System.out.println(ans);
            return 1;
        }
      int x=  maze(n-1, ans+"1");
       int y= maze(n-2, ans+"2");
       int z= maze(n-3, ans+"3");
       int a= maze(n-4, ans+"4");
       int b= maze(n-5, ans+"5");
       int c= maze(n-6, ans+"6");

       return x+y+z+a+b+c;
    
    }
}
