import java.util.Arrays;
import java.util.Scanner;

public class MatMulti {

        public int[][] GetMat(int row, int col){
            int[][] mat=new int[row][col];
            Scanner sc=new Scanner(System.in);
            System.out.println("enter numbers in matrix:");
            for (int i = 0; i <row ; i++) {
                for (int j = 0; j < col; j++) {
                    mat[i][j]=sc.nextInt();
                }
            }
            for (int[] rows : mat) {
                System.out.println(Arrays.toString(rows));
            }
            return mat;

        }
        public void MultiplyMat(int[][] Mat1,int[][] Mat2){
            int[][] Result=new int[Mat1.length][Mat2[0].length];
            for(int i=0;i< Mat1.length;i++){
                for (int j = 0; j < Mat2[i].length; j++) {
                    Result[i][j] = 0;
                    for (int k = 0; k <Mat2.length; k++) {
                        Result[i][j]+= Mat1[i][k] * Mat2[k][j];
                    }
                }
            }

            System.out.println("Multiplication of given matrices is:");
            for (int[] rows : Result) {
                System.out.println(Arrays.toString(rows));
            }
        }
        public static void main(String[] args) {
            Scanner in=new Scanner(System.in);
            MatMulti obj=new MatMulti();
            int row1,col1,row2,col2;
            System.out.println("enter no of rows and column of matrix 1:");
            row1=in.nextInt();
            col1=in.nextInt();
            int[][] mat1 = obj.GetMat(row1, col1);
            //second matrix
            System.out.println("enter no of rows and column of matrix 2:");
            row2=in.nextInt();
            col2=in.nextInt();
            int[][] mat2 = obj.GetMat(row2, col2);
            System.out.println("Matrix2 is:");
            if(col1==row2){
                obj.MultiplyMat(mat1,mat2);
            }
            else {
                System.out.println("Matrix Multiplication is not possible!");
            }
        }
}