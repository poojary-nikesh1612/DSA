package Array.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class SubarrayWithXORK {

    public static int subarraysXor(ArrayList<Integer> arr, int x) {
        // Write your code here.
        HashMap<Integer,Integer> map=new HashMap<>();
        int count=0;
        int XOR=0;

        for(Integer e:arr){
            map.put(XOR,map.getOrDefault(XOR,0)+1);

            XOR^=e;
            if(map.containsKey(XOR^x)){
                count+=map.get(XOR^x);
            }
        }
        return count;
    }

    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(5,3,8,3,10));
        System.out.println(subarraysXor(arr,8));
    }
}
