package Array.ArrayEasy;

public class IsArraySortedAndRotated {

    public static boolean isSorted(int[] nums) {
        int n=nums.length;
        int ele=nums[0];
        int i=1;
        while(i<n && nums[i-1]<=nums[i]){
            i++;
        }

        if(i==n)
        {
            return true;
        }

        while(i<n-1 && nums[i]<=nums[i+1] && nums[i]<=ele){
            i++;
        }

        if(i==n-1 && nums[i]<=ele){
            return true;
        }
        return false;
    }

    public static void main(String []args){
        int []arr={3,3,3,6,1,1,2};
        System.out.println(isSorted(arr));

    }
}
