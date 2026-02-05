class MazePath{
    public static void main(String[] args) {
        int er=20;
        int ec=15;
        mazePath(er,ec,0,0,"");
    }
    public static void mazePath(int er,int ec,int cr,int cc,String ans){
       if(cr==er&&cc==ec){//positive base case
        System.out.println(ans);
        return ;
       }
       if(cr>er||cc>ec){//neagtive base case
        return ;
       }
        mazePath(er, ec, cr, cc+1, ans+"H");
        mazePath(er, ec, cr+1, cc, ans+"V");
        mazePath(er, ec, cr+1, cc+1, ans+"D");  
      }

}