package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class SmallestDivisor {
    public static boolean isPossible(int[]nums,int threshold,int mid){
        int sum=0;

        for(int x:nums){
            sum+=(int)Math.ceil((double)x/mid);
        }
        return sum<=threshold;

    }
    public static int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high= Arrays.stream(nums).max().getAsInt();
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(nums,threshold,mid)){
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
        int[]arr={44,22,33,11,1};
        System.out.println(smallestDivisor(arr,5));
    }
}
