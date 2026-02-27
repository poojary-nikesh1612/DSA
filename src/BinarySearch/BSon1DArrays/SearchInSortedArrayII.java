package BinarySearch.BSon1DArrays;

public class SearchInSortedArrayII {

    public static boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target)return true;

            else if(nums[low]==nums[mid]&& nums[mid]==nums[high]){
                low++;
                high--;
            }
            else if(nums[low]<=nums[mid]){
                if(nums[low]<=target && target<nums[mid])high=mid-1;
                else low=mid+1;
            }
            else{
                if(nums[mid]<target && nums[high]>=target)low=mid+1;
                else high=mid-1;
            }
        }
        return false;
    }

    static void main(String[]args){
        int[]arr={2,5,6,0,0,1,2};
        System.out.println(search(arr,0));
    }
}
