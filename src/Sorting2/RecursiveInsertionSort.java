package Sorting2;

public class RecursiveInsertionSort {

    public static void insertionSort(int []arr,int n){
        int i=n-1;
        while(i>0 && arr[i]<arr[i-1]){
            int temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
            i--;
        }

        if(n==arr.length)
            return;
        insertionSort(arr,n+1);
    }

    public static void main(String[]args){
        int []arr={20,45,21,4,12,6};
        insertionSort(arr,2);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
