package Array.ArrayMedium;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsequenceSequence {

    //optimal soln
    public static int longestConsecutive(int[] nums) {
        int longest=0;
        HashSet<Integer> set=new HashSet<>();
        for(int x:nums){
            set.add(x);
        }
        for(int it:set){
            if(!set.contains(it-1)){
                int cnt=1;
                int x=it+1;
                while(set.contains(x)){
                    cnt++;
                    x++;
                }
                longest=Math.max(longest,cnt);
            }
        }
        return longest;
    }


    //Better approach using sort and then traverse O(nlogn)+O(n)
    public static int lengthOfLongestConsecutiveSequence(int[] arr, int N) {
        // Write your code here.
        int longest=0;
        int count=0;
        int lastSmaller=Integer.MIN_VALUE;
        Arrays.sort(arr);

        for(int i=0;i<N;i++){
            if(arr[i]-1==lastSmaller){
                count++;
                lastSmaller=arr[i];
            }
            else if(arr[i]!=lastSmaller){
                count=1;
                lastSmaller=arr[i];
            }
            if(count>longest){
                longest=count;
            }
        }
        return longest;
    }

    public static void main(String[]args){
        int[] arr={100,4,200,1,3,2};
       System.out.println(lengthOfLongestConsecutiveSequence(arr,arr.length));
        System.out.println(longestConsecutive(arr));
    }
}
