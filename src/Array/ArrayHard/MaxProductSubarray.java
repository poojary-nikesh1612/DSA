package Array.ArrayHard;

public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {
        int n=nums.length;
        int prod1=1;
        int prod2=1;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            prod1*=nums[i];
            prod2*=nums[n-1-i];
            max= Math.max(max,Math.max(prod1,prod2));
            if(prod1==0)prod1=1;
            if(prod2==0)prod2=1;
        }
        return max;
    }
    public static void main(String[]args){
        int[]arr={2,3,-2,4};
        System.out.println(maxProduct(arr));
    }
}
