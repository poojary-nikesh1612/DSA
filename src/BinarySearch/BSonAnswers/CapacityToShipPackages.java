package BinarySearch.BSonAnswers;

import java.util.Arrays;

public class CapacityToShipPackages {
    public static boolean isPossible(int[]weights,long mid,int days){
        int cnt=0;
        long sum=0;
        for(int weight:weights){
            sum+=weight;

            if(sum>mid){
                cnt++;
                sum=weight;
            }
        }
        if(sum>0)cnt++;
        return cnt<=days;
    }
    public static int shipWithinDays(int[] weights, int days) {
        long sum= Arrays.stream(weights).asLongStream().sum();

        long low=Arrays.stream(weights).max().getAsInt();
        long high=sum;
        int ans=-1;

        while(low<=high){
            long mid=low+(high-low)/2;

            if(isPossible(weights,mid,days)){
                ans=(int)mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[]args){
        int[] arr={3,2,2,4,1,4};
        System.out.println(shipWithinDays(arr,3));
    }
}
