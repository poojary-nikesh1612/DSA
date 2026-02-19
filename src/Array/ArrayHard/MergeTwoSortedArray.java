package Array.ArrayHard;

public class MergeTwoSortedArray {
    //Merge 2 sorted array without using any extra space & this soln is for leetcode problem,
    // other general approach is in notes.

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int left=m-1;
        int right=n-1;
        int index=(n+m)-1;

        while(left>=0 && right>=0){
            if(nums1[left]>=nums2[right]){
                nums1[index--]=nums1[left--];
            }
            else{
                nums1[index--]=nums2[right--];
            }
        }

        while(right>=0){
            nums1[index--]=nums2[right--];
        }
    }

    public static void main(String[]args){
        int[] arr1={3,6,9,0,0};
        int[] arr2={4,10};
        merge(arr1,3,arr2,2);

        for(int x:arr1){
            System.out.print(x+" ");
        }
    }
}
