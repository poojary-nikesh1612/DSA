package BinarySearch.BSon2DArrays;

public class SearchOn2D {

    //optimal one
    public static boolean searchMatrix1(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=(n*m)-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int i=mid/n;
            int j=mid%n;
            if(target==matrix[i][j]){
                return true;
            }
            else if(target<matrix[i][j]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }

        }
        return false;
    }

    //my soln
    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int n=matrix[0].length;
        int low=0;
        int high=m-1;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(target>=matrix[mid][0]&&target<=matrix[mid][n-1]){
                int left=0;
                int right=n-1;

                while(left<=right){
                    int cntr=left+(right-left)/2;

                    if(target==matrix[mid][cntr]){
                        return true;
                    }
                    else if(target<matrix[mid][cntr]){
                        right=cntr-1;
                    }
                    else{
                        left=cntr+1;
                    }
                }
                return false;
            }
            else if(target<matrix[mid][0]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

        return false;
    }

    public static void main(String[]args){
        int[][] matrix={{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix1(matrix,3));
    }
}
