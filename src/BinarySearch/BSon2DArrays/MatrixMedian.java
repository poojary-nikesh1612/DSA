package BinarySearch.BSon2DArrays;

public class MatrixMedian {
    public static int countLessEqual(int[]row,int value){
        int low=0;
        int high=row.length;

        while(low<high){
            int mid=low+(high-low)/2;

            if(row[mid]<=value)
                low=mid+1;
            else
                high=mid;
        }
        return low;

    }
    public static int findMedian(int matrix[][], int m, int n) {
        // Write your code here
        int low=matrix[0][0];
        int high=matrix[0][n-1];

        for(int i=1;i<m;i++){
            low=Math.min(low,matrix[i][0]);
            high=Math.max(high,matrix[i][n-1]);
        }

        while(low<high){
            int mid=low+(high-low)/2;
            int cnt=0;

            for(int i=0;i<m;i++){
                cnt+=countLessEqual(matrix[i],mid);
            }

            if(cnt<(m*n+1)/2){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }

    public static void main(String[]args){
        int[][] mat={{1, 5, 7, 9, 11},{2, 3, 4, 8, 9},{4, 11, 14, 19, 20},{6, 10, 22, 99, 100},{7, 15, 17, 24, 28}};
        System.out.println(findMedian(mat,mat.length,mat[0].length));
    }
}
