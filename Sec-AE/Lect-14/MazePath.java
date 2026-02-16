class MazePath{

    public static void main(String[] args) {
        int row=3;
        int col=3;
        maze(row,col,0,0,"");
    }
    public static void maze(int er,int ec,int cr,int cc,String ans){
        if(er==cr&&ec==cc){
            System.out.println(ans);
            return ;
        }
        if(cr>er||cc>ec){
            return ;
        }
        maze(er, ec, cr, cc+1, ans+"H");
        maze(er, ec, cr+1, cc, ans+"V");
        maze(er, ec, cr+1, cc+1, ans+"D");
    }
}