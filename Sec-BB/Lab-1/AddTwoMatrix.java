public class AddTwoMatrix {
    public static void main(String[] args) {
         int[][] mat={{1,2},{3,4}};
        int[][] mat2={{5,6},{7,8}};

        int[][] res=new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                res[i][j]=mat[i][j]+mat2[i][j];
            }
        }
        for(int i=0;i<res.length;i++){
            for(int j=0;j<res[0].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
