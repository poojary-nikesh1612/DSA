package Array.ArrayMedium;

import java.util.HashMap;

public class CountSubarrayWithSumK {

    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> preSumMap=new HashMap<>();
        int count=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum==k){
                count++;
            }
            int rem=sum-k;
            if(preSumMap.containsKey(rem)){
                count+=preSumMap.get(rem);
            }
            preSumMap.put(sum,preSumMap.getOrDefault(sum,0)+1);
        }
        return count;
    }

    public static void main(String[]args){
        int[]arr={1,2,3,1,1,1,3,3};
        System.out.println(subarraySum(arr,3));
    }
}
