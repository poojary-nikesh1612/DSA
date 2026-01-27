package Array.ArrayEasy;

public class RotateBYOne {

    public static void rotateArrayByOne(int[] nums) {
        int n=nums.length;
        int temp=nums[0];
        for(int i=1;i<n;i++){
            nums[i-1]=nums[i];
        }
        nums[n-1]=temp;
    }

    public static void main(String []args){
        int []arr={1,2,3,4,5,7};
        rotateArrayByOne(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
