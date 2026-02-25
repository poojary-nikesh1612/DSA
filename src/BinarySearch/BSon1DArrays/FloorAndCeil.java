package BinarySearch.BSon1DArrays;

public class FloorAndCeil {
    public static int[] getFloorAndCeil(int[] nums, int x) {
        int n=nums.length;
        int floor=-1;
        int ceil=-1;
        int low=0;
        int high=n-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==x){
                return new int[]{x,x};
            }
            else if(nums[mid]<x){
                floor=nums[mid];
                low=mid+1;
            }
            else{
                ceil=nums[mid];
                high=mid-1;
            }
        }

        return new int[]{floor,ceil};
    }

    public static void main(String[]args){
        int[]arr={3, 4, 4, 7, 8, 10};
        int[]ans=getFloorAndCeil(arr,5);
        System.out.println(ans[0]+" "+ans[1]);
    }
}
