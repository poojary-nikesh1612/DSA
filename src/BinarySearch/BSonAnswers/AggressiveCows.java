package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class AggressiveCows {
    public static boolean canPlace(int[]stalls,int d,int k){
        int count=1;
        int lastPos=stalls[0];

        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-lastPos>=d){
                count++;
                lastPos=stalls[i];
            }
            if(count>=k) return true;
        }
        return false;
    }
    public static int aggressiveCows(int []stalls, int k) {
        //    Write your code here.
        Arrays.sort(stalls);
        int low=1;
        int high=stalls[stalls.length-1] -stalls[0];
        int ans=0;

        while(low<=high){
            int mid=low+(high-low)/2;

            if(canPlace(stalls,mid,k)){
                ans=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return ans;

    }

    public static void main(String[]args){
        int[]arr={0, 3, 4, 7, 10, 9};
        System.out.println(aggressiveCows(arr,4));
    }
}
