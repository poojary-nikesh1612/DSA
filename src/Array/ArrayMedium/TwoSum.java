package Array.ArrayMedium;
import java.util.HashMap;
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            int rem=target-nums[i];
            if(map.containsKey(rem)){
                return new int[] {i,map.get(rem)};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }

    public static void main(String[]args){
        int[]arr={1,2,4,5,3,8,6};
        int[]res=twoSum(arr,13);
        for(int x:res){
            System.out.print(x+" ");
        }
    }
}
