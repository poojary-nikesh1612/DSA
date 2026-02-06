package Array.ArrayMedium;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        int i=n-2;
        while(i>=0 && nums[i]>=nums[i+1]){
            i--;
        }
        if(i==-1){
            for(int j=0;j<n/2;j++){
                int temp=nums[j];
                nums[j]=nums[n-1-j];
                nums[n-1-j]=temp;
            }
        }
        else{
            int j=n-1;
            while(j>i && nums[j]<=nums[i]){
                j--;
            }
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;

            for(int k=0;k<(n-i)/2;k++){
                temp=nums[k+i+1];
                nums[k+i+1]=nums[n-1-k];
                nums[n-1-k]=temp;
            }
        }
    }

    public static void main(String[]args){
        int [] arr={1,3,1};
        nextPermutation(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
