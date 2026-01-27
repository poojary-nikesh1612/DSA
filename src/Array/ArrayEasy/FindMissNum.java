package Array.ArrayEasy;

public class FindMissNum {

    public static int missingNumber(int[] nums) {
        int n=nums.length;

        int res=0;

        for(int i=0;i<n;i++){
            res=res^(i+1)^nums[i];
        }
        return res;

//        int sum=n*(n+1)/2;
//        int arrSum=0;
//        for(int i=0;i<n;i++){
//            arrSum+=nums[i];
//        }
//        return sum-arrSum;
    }

    public static void main(String[]args){
        int[]arr={0,1,2,4,5};
        System.out.println(missingNumber(arr));
    }
}
