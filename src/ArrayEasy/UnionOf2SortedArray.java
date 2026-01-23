package ArrayEasy;
import java.util.TreeSet;
import java.util.ArrayList;

public class UnionOf2SortedArray {
    public static int[] unionArray(int[] nums1, int[] nums2) {

        //brute approach
      /*  TreeSet<Integer> set=new TreeSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            set.add(nums2[i]);
        }

        int[]arr=new int[set.size()];
        int i=0;
        for(int x:set){
            arr[i++]=x;
        }
        return arr;

       */

        //optimal approach
        ArrayList<Integer>union=new ArrayList<>();

        int n1=nums1.length;
        int n2=nums2.length;
        int i=0,j=0;

        while(i<n1 && j<n2){
            if(nums1[i]<=nums2[j]){
                if(union.isEmpty() || union.getLast()!=nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
            else{
                if(union.isEmpty()|| union.getLast()!=nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        if(i<n1){
            while(i<n1){
                if(union.getLast()!=nums1[i]){
                    union.add(nums1[i]);
                }
                i++;
            }
        }
        else{
            while(j<n2){
                if(union.getLast()!=nums2[j]){
                    union.add(nums2[j]);
                }
                j++;
            }
        }

        int [] arr=new int[union.size()];
        int k=0;
        for(Integer x:union ){
            arr[k++]=x;
        }
return arr;

    }

    public static void main(String []args){
        int[]arr1={1,2,4,5,7};
        int[]arr2={1,3,4,5,9};
        int[] union=unionArray(arr1,arr2);
        for(int x:union){
            System.out.print(x+" ");
        }
    }
}
