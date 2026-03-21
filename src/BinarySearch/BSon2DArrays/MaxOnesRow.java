package BinarySearch.BSon2DArrays;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxOnesRow {
    public static int maximumOnesRow(ArrayList<ArrayList<Integer>> matrix, int n, int m)
    {
        //	  Write your code here.
        int maxInd=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++ ){
            int low=0;
            int high=m-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix.get(i).get(mid)==1){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            if(max<m-low){
                max=m-low;
                maxInd=i;
            }
        }
        return maxInd;
    }

    public static void main(String[]args){
        ArrayList<ArrayList<Integer>> matrix=new ArrayList<>();

        matrix.add(new ArrayList<>(Arrays.asList(1,  1,  1)));
        matrix.add(new ArrayList<>(Arrays.asList(0,  0,  1)));
        matrix.add(new ArrayList<>(Arrays.asList(1,  0,  1)));

        System.out.println(maximumOnesRow(matrix,matrix.size(),matrix.getFirst().size()));
    }
}
