package Array.ArrayMedium;

import java.util.Arrays;

public class MaxSubArrSum {

    //returns max subarray sum
    public static long maxSubarraySum(int[] arr, int n) {
        // write your code here
        long max=Long.MIN_VALUE;
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            max=Math.max(max,sum);
            if(sum<0){
                sum=0;
            }
        }

        return max<0?0:max;
    }

    //returns a subarray with max sum
    public static int[] maxSubarray(int[] arr, int n) {
        // write your code here
        long max=Long.MIN_VALUE;
        int start=-1 ,ansStart=-1,ansEnd=-1;
        long sum=0;
        for(int i=0;i<n;i++){
            if(sum==0)start=i;
            sum+=arr[i];
            if(max<sum){
                max=sum;
                ansStart=start;
                ansEnd=i;
            }
            if(sum<0){
                sum=0;
            }
        }

  return Arrays.copyOfRange(arr,ansStart,ansEnd+1);

    }

    public static void main(String[]args){
        int[]arr={-2,-3,4,-2,-1,1,5,-3};
    System.out.println(maxSubarraySum(arr,arr.length));
        int [] maxArr=maxSubarray(arr,arr.length);
        for(int x:maxArr){
            System.out.print(x+" ");
        }
    }
}

//using divide and conquer
class Solution {
    public int maxSubArray(int[] nums) {
        return maxSum(0,nums.length-1,nums);
    }

    private static int maxSum(int l,int r,int[] nums){
        if(l==r){
            return nums[l];
        }
        int mid=(l+r)/2;
        int leftSum=maxSum(l,mid,nums);
        int rightSum=maxSum(mid+1,r,nums);
        int crossSum=maxCrossSum(nums,l,r,mid);

        return Math.max(leftSum,Math.max(rightSum,crossSum));
    }

    private static int maxCrossSum(int[] nums,int l,int r,int mid){
        int leftCrossMax=Integer.MIN_VALUE;
        int rightCrossMax=Integer.MIN_VALUE;
        int sum=0;
        for(int i=mid;i>=0;i--){
            sum+=nums[i];
            if(leftCrossMax<sum){
                leftCrossMax=sum;
            }
        }
        sum=0;
        for(int i=mid+1;i<=r;i++){
            sum+=nums[i];
            if(rightCrossMax<sum){
                rightCrossMax=sum;
            }
        }
        return leftCrossMax+rightCrossMax;
    }
}
