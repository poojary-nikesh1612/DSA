package BinarySearch.BSon1DArrays;

public class LowerBound {

    public static int lowerBound(int[] nums, int x) {
        int low=0;
        int high=nums.length-1;
        int ans=nums.length;
        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]>=x){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }

       return ans;
    }

    public static void main(String[]args){
        int[]arr={3,5,8,15,19};
        System.out.println(lowerBound(arr,9));
    }
}
