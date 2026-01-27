package Array.ArrayEasy;

public class RotateByDplace {

    public static void reverseArray(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        int n=nums.length;

        if(n<=1 || k==0){
            return;
        }

        k=k%n;

        //right shift
//        reverseArray(nums,0,n-1);
//        reverseArray(nums,0,k-1);
//        reverseArray(nums,k,n-1);

        //leftshift
        reverseArray(nums,0,k-1);
        reverseArray(nums,k,n-1);
        reverseArray(nums,0,n-1);
    }

    public static void main(String []args){
        int []arr={1,2,3,4,5,7};
        rotate(arr,3);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
