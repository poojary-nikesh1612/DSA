package BinarySearch.BSonAnswers;

public class FindNthRoot {
    public static int NthRoot(int n, int m) {
        // Write your code here.
        int low=1;
        int high=m;

        while(low<=high){
            long mid=low+(high-low)/2;
            long ans=1;
            for(int i=0;i<n;i++){
                ans*=mid;
                if(ans>m)break;
            }
            if(ans==m){
                return (int)mid;
            }
            else if(ans>m){
                high=(int)mid-1;
            }
            else{
                low=(int)mid+1;
            }
        }
        return -1;
    }

    static void main(String[]args){
        System.out.println(NthRoot(3,27));
    }
}
