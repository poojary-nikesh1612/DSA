package Sorting1;

public class SelectionSort {

    public static void selectionSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int pos=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[pos]){
                    pos=j;
                }
            }
            if(pos!=i){
                int temp=arr[pos];
                arr[pos]=arr[i];
                arr[i]=temp;
            }
        }
    }

    public static void main(String []args){
        int []arr={10,45,23,6,9,12,43};
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        selectionSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
