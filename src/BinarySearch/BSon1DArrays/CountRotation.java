package BinarySearch.BSon1DArrays;

public class CountRotation {

    public static int findKRotation(int []arr){
        // Write your code here.
        int low=0;
        int high=arr.length-1;

        while(low<high){
            int mid=(low+high)/2;

            if(arr[mid]>arr[high])low=mid+1;
            else high=mid;
        }
        return low;
    }
    static void main(String[]args){
        int[]arr={3, 4, 5, 1, 2};
        System.out.println(findKRotation(arr));
    }
}
