package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class KokoEatingBananas {

    public static long getTotalSpeed(int[]piles,int speed){
        long totalHr=0;
        for(int banana:piles){
            totalHr+=(long)Math.ceil((double)banana/speed);
        }
        return totalHr;
    }

    public static int minEatingSpeed(int[] piles, int h) {

        int n=piles.length;
        int max= Arrays.stream(piles).max().getAsInt();
        int ans=max;


        int low=1;
        int high=max;

        while(low<=high){
            int mid=low+(high-low)/2;

            long totalHr=getTotalSpeed(piles,mid);
            if(totalHr<=h){
                ans=mid;
                high=mid-1;
            }

            else low=mid+1;
        }
        return ans;
    }

    static void main(String[]args){
        int[]piles={30,11,23,4,20};
        System.out.println(minEatingSpeed(piles,5));
    }
}
