package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class SplitArrayLargestSum {
    public static int countSubArr(int[]nums,int sum){
        int subArr=1;
        int subSum=0;
        for(int x:nums){
            if(subSum+x<=sum){
                subSum+=x;
            }
            else{
                subArr++;
                subSum=x;
            }
        }
        return subArr;
    }
    public static int splitArray(int[] nums, int k) {
        if(nums.length<k)return -1;
        int low= Arrays.stream(nums).max().getAsInt();
        int high=Arrays.stream(nums).sum();

        while(low<=high){
            int mid=low+(high-low)/2;
            int subArr=countSubArr(nums,mid);

            if(subArr>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
    }

    public static void main(String[]args){
        int[]nums={1,2,3,4,5};
        System.out.println(splitArray(nums,2));
    }
}
