package Sorting1;

public class InsertionSort {

    public static void insertionSort(int []arr){
        int n=arr.length;
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
    public static void main(String []args){
        int []arr={12,3,45,6,23,1,65,34,2,7,45};

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        insertionSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
