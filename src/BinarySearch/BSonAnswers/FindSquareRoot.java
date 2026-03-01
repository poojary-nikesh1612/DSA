package BinarySearch.BSonAnswers;

public class FindSquareRoot {
    public static int squareRoot(int a)
    {
        // Write your code here.
        int low=1;
        int high=a;
        int ans=0;

        while(low<=high){
            int mid=(low+high)/2;

            if(mid*mid>a){
                high=mid-1;
            }
            else{
                ans=mid;
                low=mid+1;
            }
        }
        return ans;
    }

    static void main(String[]args){
        System.out.println(squareRoot(36));
    }
}
