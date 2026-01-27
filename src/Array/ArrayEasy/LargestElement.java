package Array.ArrayEasy;

public class LargestElement {

    static int largestElement(int[] arr) {
        // Write your code here.
        int max=Integer.MIN_VALUE;
        for(int x:arr){
            if(x>max){
                max=x;
            }
        }
        return max;
    }

    public static void main(String []args){
        int []arr={1,4,3,6,7,5,4,7,6};
        System.out.println(largestElement(arr));
    }
}
