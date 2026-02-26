package BinarySearch.BSon1DArrays;

public class NumberOfOccurrence {
    public static int findFirst(int[]nums,int target,int n){
        int low=0;
        int high=n-1;
        int first=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return first;
    }

    public static int findLast(int[]nums,int target,int n){
        int low=0;
        int high=n-1;
        int last=-1;

        while(low<=high){
            int mid=(low+high)/2;

            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }
        return last;
    }

    public static int count(int arr[], int n, int x) {
        //Your code goes here
        int first=findFirst(arr,x,n);
        int last=findLast(arr,x,n);

        if(first==-1) return 0;

        return (last-first)+1;
    }

    static void main(String[]args){
        int[] arr={1, 1, 1, 2, 2, 3, 3};
        System.out.println(count(arr,arr.length,3));
    }
}
