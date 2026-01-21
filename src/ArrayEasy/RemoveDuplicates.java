package ArrayEasy;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        int index=0;

        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
    public static void main(String []args){
        int []arr={1,1,2,3,4,4,5,6,6,6,8};
        int k= removeDuplicates(arr);

        for(int i=0;i<k;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
