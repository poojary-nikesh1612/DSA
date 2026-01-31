package Array.ArrayMedium;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        //moore's voting algo
        int ele=0,count=0;

        for(int x:nums){
            if(count==0){
                ele=x;
                count++;
            }
            else if(ele==x){
                count++;
            }
            else{
                count--;
            }
        }

        if(count>0){
            count=0;
            for(int x:nums){
                if(ele==x){
                    count++;
                }
            }
        }

        if(count>nums.length/2){
            return ele;
        }
        return -1;


        //uisng hashing
       /* HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>nums.length/2){
                return e.getKey();
            }
        }
        return -1;

        */
    }

    public static void main(String []args){
        int[] arr={1,2,5,4,5,2,2,2};
        System.out.println(majorityElement(arr));
    }
}
