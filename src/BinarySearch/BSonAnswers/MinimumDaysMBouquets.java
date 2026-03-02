package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class MinimumDaysMBouquets {

    public static boolean isPossible(int[]bloomDay,int day,int k,int m){
        int count=0;
        int bouquets=0;

        for(int x:bloomDay){
            if(x<=day)
                count++;
            else{
                bouquets+=(count/k);
                count=0;
            }
        }
        bouquets+=(count/k);
        return bouquets>=m;
    }

    public static int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k)return -1;

        int ans=-1;
        int low= Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();

        while(low<=high){
            int mid=low+(high-low)/2;

            if(isPossible(bloomDay,mid,k,m)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }


        }

        return ans;
    }

    static void main(String[]args){
        int[]arr={7,7,7,7,12,7,7};
        System.out.println(minDays(arr,2,3));
    }
}
