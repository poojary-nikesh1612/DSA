package Array.ArrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeadersInArray {
    public static ArrayList<Integer> findLeaders(ArrayList<Integer> elements, int n) {
        // Write your code here.
        ArrayList<Integer> ans=new ArrayList<>();
        int max=Integer.MIN_VALUE;
        for(int i=n-1;i>=0;i--){
            if(elements.get(i)>max){
                max=elements.get(i);
                ans.add(max);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
    public static void main(String[]args){
        ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(6,7,4,2,5,3));
        ArrayList<Integer> res=findLeaders(arr,arr.size());
        for(int x:res){
            System.out.print(x+" ");
        }

    }
}
