package Array.ArrayEasy;

public class LongestsubarrayofSumK {

    public static int longestSubarrayWithSumK(int []a, long k) {
        // Better soln in case of only +ve elements array, for array with +ve,-ve and 0's or array with +ve&o's
        // this is the optimal soln.
       /* HashMap<Long,Integer> preSumMap=new HashMap<>();
        int maxLen=0;
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
            if(sum==k){
                maxLen=Math.max(maxLen,i+1);
            }
            long rem=sum-k;
            if(preSumMap.get(rem)!=null){
                maxLen=Math.max(maxLen,i-preSumMap.get(rem));
            }
                preSumMap.putIfAbsent(sum,i);


        }
        return maxLen;

        */

        //optimal one incase of array only with +ve elements.
        int left=0,right=0;
        long sum=0;
        int maxLen=0;
        while(right<a.length){
            sum+=a[right];

            while(sum>k && left<=right){
                sum-=a[left];
                left++;
            }
            if(sum==k){
                maxLen=Math.max(maxLen,(right-left)+1);
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[]args){
        int[]arr={1,2,3,2,1,1,1,3,2,4,1,1};
        System.out.println(longestSubarrayWithSumK(arr,4));
    }
}
