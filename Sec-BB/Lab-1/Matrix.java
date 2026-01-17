import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter for first matrix");
        int row=sc.nextInt();
        int col=sc.nextInt();

        int[][] arr=new int[row][col];
      //taking user input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println("for the 2nd matrix");
         int row1=sc.nextInt();
        int col1=sc.nextInt();

        int[][] arr1=new int[row][col];
      //taking user input
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }



        int[][] ans=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                ans[i][j]=arr[i][j]+arr1[i][j];
            }
        }
        //print the matrix
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
               System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
        int[][] mat={{1,2},{3,4}};
       

        
    }
}
