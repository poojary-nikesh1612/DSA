package BinarySearch.BSon1DArrays;

public class FirstAndLastOccurrence {

    public static int findFirst(int[]nums,int target,int n){
        int low=0;
        int high=n-1;
        int first=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return first;
    }

    public static int findLast(int[]nums,int target,int n){
        int low=0;
        int high=n-1;
        int last=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return last;
    }
    public static int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int[]ans=new int[2];

        ans[0]=findFirst(nums,target,n);
        ans[1]=findLast(nums,target,n);
        return ans;
    }

    public static void main(String[]args){
        int[]arr={5,7,7,8,8,10};
        int[]ans=searchRange(arr,8);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
