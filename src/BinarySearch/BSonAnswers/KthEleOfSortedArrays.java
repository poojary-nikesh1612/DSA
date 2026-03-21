package BinarySearch.BSonAnswers;

public class KthEleOfSortedArrays {
    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        // Write your code here.
        if(m>n) return ninjaAndLadoos(row2,row1,n,m,k);

        int low=Math.max(0,k-n);
        int high=Math.min(k,m);

        while(low<=high){
            int mid1=low+(high-low)/2;
            int mid2=k-mid1;
            int l1=Integer.MIN_VALUE;
            int l2=Integer.MIN_VALUE;
            int r1=Integer.MAX_VALUE;
            int r2=Integer.MAX_VALUE;

            if(mid1<m)r1=row1[mid1];
            if(mid2<n)r2=row2[mid2];
            if(mid1-1>=0)l1=row1[mid1-1];
            if(mid2-1>=0 )l2=row2[mid2-1];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                high=mid1-1;
            }
            else{
                low=mid1+1;
            }

        }
        return -1;
    }

    public static void main(String[]args){
        int[]arr1={2, 5, 8, 17};
        int[]arr2={1, 4, 8, 13, 20};
        System.out.println(ninjaAndLadoos(arr1,arr2,arr1.length,arr2.length,4));
    }
}
