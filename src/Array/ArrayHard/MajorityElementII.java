package Array.ArrayHard;

import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> list=new ArrayList<>();
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        int count1=0;
        int count2=0;

        for (int x : nums) {
            if (x == ele1) {
                count1++;
            }
            else if (x == ele2) {
                count2++;
            }
            else if (count1 == 0) {
                ele1 = x;
                count1 = 1;
            }
            else if (count2 == 0) {
                ele2 = x;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;

        for(int x: nums){
            if(x==ele1){
                count1++;
            }
            else if(x==ele2){
                count2++;
            }
        }

        if(count1>nums.length/3){
            list.add(ele1);
        }
        if(count2>nums.length/3){
            list.add(ele2);
        }
        return list;
    }

    public static void main(String[]args){
        int[] arr={1,2,1,3,3,1,2,3};
       List<Integer> ans= majorityElement(arr);
        for(Integer x:ans){
            System.out.print(x+" ");
        }

    }
}
