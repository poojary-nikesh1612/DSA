package Sorting2;

public class QuickSort {

    public static void quickSort(int []arr,int low,int high){
       if(low<high){
           int pt=partitionD(arr,low,high);
           quickSort(arr,low,pt-1);
           quickSort(arr,pt+1,high);
       }
    }

    public static int partition(int []arr,int low,int high){
        int p = arr[low];
        int i=low+1;
        int j=high;

        while(i<=j){
            while(i<high  && arr[i]<=p )
            {
                i++;
            }
            while(j>low && arr[j]>p ){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        arr[low]=arr[j];
        arr[j]=p;
        return j;
    }

    public static int partitionD(int []arr,int low,int high){
        int p = arr[low];
        int i=low+1;
        int j=high;

        while(i<=j){
            while(i<=high  && arr[i]>=p )
            {
                i++;
            }
            while(j>low && arr[j]<p ){
                j--;
            }
            if(i<j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        arr[low]=arr[j];
        arr[j]=p;
        return j;
    }

    public static void main(String[]args){
        int []arr={20,45,21,4,12,6};
        quickSort(arr,0,arr.length-1);
        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}
