package BinarySearch.BSon2DArrays;

public class PeakEle2D {
    public static int maxElement(int[][]mat,int col){
        int max=mat[0][col];
        int ind=0;
        for(int i=1;i<mat.length;i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                ind=i;
            }
        }
        return ind;
    }
    public static int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;

        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int row=maxElement(mat,mid);
            int left=mid-1>=0?mat[row][mid-1]:Integer.MIN_VALUE;
            int right=mid+1<n?mat[row][mid+1]:Integer.MIN_VALUE;

            if(mat[row][mid]>left && mat[row][mid]>right){
                return new int[]{row,mid};
            }
            else if(mat[row][mid]>right)
                high=mid;

            else
                low=mid+1;

        }
        return new int[]{-1,-1};
    }

    public static void main(String[]args){
        int[][]mat={{1,4},{3,2}};
        int[]ans=findPeakGrid(mat);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
