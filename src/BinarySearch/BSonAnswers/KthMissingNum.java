package BinarySearch.BSonAnswers;

public class KthMissingNum {

    public static int findKthPositive(int[] arr, int k) {
        int n=arr.length;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=low+(high-low)/2;
            int missingNum=arr[mid]-(mid+1);
            if(missingNum<k){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return k+high+1;
    }

    public static void main(String[]args){
        int[]arr={2,3,4,7,11};
        System.out.println(findKthPositive(arr,5));
    }
}
