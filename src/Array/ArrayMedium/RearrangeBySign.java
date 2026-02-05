package Array.ArrayMedium;
import java.util.ArrayList;
public class RearrangeBySign {
    public static int[] rearrangeArray(int[] nums) {
        //Brute approach
//        int n=nums.length;
//        int[] posi=new int[n/2];
//        int[] neg=new int[n/2];
//        int i=0,j=0;
//        for(int k=0;k<n;k++){
//            if(nums[k]>0){
//                posi[i++]=nums[k];
//            }
//            else{
//                neg[j++]=nums[k];
//            }
//        }
//        for(int k=0;k<n/2;k++){
//            nums[2*k]=posi[k];
//            nums[2*k+1]=neg[k];
//        }
//
//        return nums;

        //Optimal soln 1
        int n=nums.length;
        int[] ans=new int[n];
        int pos=0,neg=1;

        for(int i=0;i<n;i++){
            if(nums[i]>0){
                ans[pos]=nums[i];
                pos+=2;
            }
            else{
                ans[neg]=nums[i];
                neg+=2;
            }
        }
        return ans;
    }

    public static int[] reArrangeArrayNotEqual(int[] nums){
        int n=nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
        ArrayList<Integer> neg=new ArrayList<>();

        int j=0,k=0;
        for (int num : nums) {
            if (num > 0) {
                pos.add(num);
            } else {
                neg.add(num);
            }
        }

        if(pos.size()<neg.size()){
            for(int i=0;i<pos.size();i++){
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            int index=pos.size()*2;
            for(int i=pos.size();i<neg.size();i++){
                nums[index]=neg.get(i);
                index++;
            }
        }
        else{
            for(int i=0;i<neg.size();i++){
                nums[2*i]=pos.get(i);
                nums[2*i+1]=neg.get(i);
            }
            int index=neg.size()*2;
            for(int i=neg.size();i<pos.size();i++){
                nums[index]=pos.get(i);
                index++;
            }
        }
        return nums;
    }
    public static void main(String[]args){
        int[] arr={3,1,7,-2,-5,2,-4,9};
        int[] res=reArrangeArrayNotEqual(arr);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
