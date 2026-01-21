package ArrayEasy;

public class SLargestElement {
    public static int secondLargest(int n, int[] arr) {
        if(n<2)
        {
            return -1;
        }

        int large=Integer.MIN_VALUE;
        int secondLarge=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(large<arr[i]){
                secondLarge=large;
                large=arr[i];
            }
            else if(secondLarge<arr[i]&& arr[i]<large){
                secondLarge=arr[i];
            }
        }
        if(secondLarge==Integer.MIN_VALUE){
            return -1;
        }
        else{
            return secondLarge;
        }
    }

    public static int secondSmallest(int n,int [] arr){
        if(n<2){
            return -1;
        }

        int small=arr[0];
        int sSmall=Integer.MAX_VALUE;

        for(int i=1;i<n;i++){
            if(arr[i]<small){
                sSmall=small;
                small=arr[i];
            }
            else if(sSmall>arr[i] && arr[i]>small){
                sSmall=arr[i];
            }
        }

        if(sSmall==Integer.MAX_VALUE){
            return -1;
        }
        else{
            return sSmall;
        }
    }
    public static void main(String []args){
        int []arr={1,4,3,6,7,5,4,7,6};
        System.out.println(secondLargest(arr.length,arr));
        System.out.println(secondSmallest(arr.length,arr));
    }
}
