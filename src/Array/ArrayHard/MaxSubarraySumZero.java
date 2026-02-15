package Array.ArrayHard;

import java.util.HashMap;

public class MaxSubarraySumZero {

    public static int maxLen(int[] arr) {
        // Your code goes here
        int sum=0;
        int max=Integer.MIN_VALUE;
        HashMap<Integer,Integer> hash=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(hash.containsKey(sum)){
                max=Math.max(max,i-hash.get(sum));
            }else{
                hash.put(sum,i);
            }
        }
        return Math.max(0,max);
    }

    public static void main(String[]args){
        int[]arr={15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(maxLen(arr));
    }
}
