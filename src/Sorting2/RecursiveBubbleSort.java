package Sorting2;

public class RecursiveBubbleSort {

    public static void bubbleSort(int [] arr,int n){
        if(n==1)
            return;
        boolean didSwap=false;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                didSwap=true;
            }
        }
        if(!didSwap)
            return;
        bubbleSort(arr,n-1);

    }

    public static void main(String[]args){
        int []arr={20,45,21,4,12,6};
        bubbleSort(arr,arr.length);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
