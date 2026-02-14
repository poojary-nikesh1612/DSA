package Array.ArrayHard;

import java.util.*;

public class ThreeSum {

    //better one
    public static List< List < Integer > > triplet(int n, int []arr) {
        // Write your code here.
        Set<List<Integer>> st=new HashSet<>();

        for(int i=0;i<arr.length;i++){
            Set<Integer> hash=new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                if(hash.contains(-(arr[i]+arr[j]))){
                    List<Integer> temp=new ArrayList<>(Arrays.asList(arr[i],arr[j],-(arr[i]+arr[j])));
                    Collections.sort(temp);
                    st.add(temp);
                }

                hash.add(arr[j]);

            }
        }
        List<List<Integer>> ans=new ArrayList<>(st);
        ans.sort((a, b) -> {
            for (int i = 0; i < 3; i++) {
                if (!a.get(i).equals(b.get(i)))
                    return a.get(i) - b.get(i);
            }
            return 0;
        });
        return ans;
    }

    //optimal one
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<n-2;i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0){
                    list.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1])j++;
                    while(j<k && nums[k]==nums[k+1])k--;
                }
                else if(sum<0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return list;
    }

    public static void main(String[]args){
        int[] arr={-1,0,1,2,-1,-4};
        //List<List<Integer>> ans=threeSum(arr);
        List<List<Integer>> ans= triplet(arr.length,arr);
        for(List<Integer> row : ans){
            System.out.print("[ ");
            for(Integer x: row){
                System.out.print(x+" ");
            }
            System.out.println("]");
        }


    }
}
