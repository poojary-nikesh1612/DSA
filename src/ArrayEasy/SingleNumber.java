package ArrayEasy;

public class SingleNumber {

    public static int occursOnce(int[] a, int n) {
        // Write your code here.
        int res=0;

        for(int i=0;i<n;i++){
            res^=a[i];
        }
        return res;
    }

    public static void main(String[]args){
        int [] arr={1,2,5,3,1,5,2};
        System.out.println(occursOnce(arr,arr.length));
    }
}
