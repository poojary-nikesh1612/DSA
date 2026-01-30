package Array.ArrayMedium;

public class SortZeroOneTwo {

    //Dutch national flag algo
    public static void sortColors(int[] nums) {
        int low=0;
        int mid=0;
        int high=nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                nums[mid++]=nums[low];
                nums[low++]=0;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                nums[mid]=nums[high];
                nums[high--]=2;
            }
        }
    }

    public static void main(String[]args){
        int[] arr={1,2,0,1,1,2,0,0,1,2,2,0,1,0,2,1,0,1,2,1,0,2,1};
        sortColors(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
