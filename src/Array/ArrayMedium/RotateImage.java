package Array.ArrayMedium;

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n=matrix.length;

        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        }
    }

    public static void main(String[]args){
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for(int[] row:matrix){
            for(int x:row){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
