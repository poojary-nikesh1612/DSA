package Sorting1;

public class BubbleSort {

    public static void bubbleSort(int []arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            boolean isSwap=false;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>=arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    isSwap=true;
                }
            }
            if(!isSwap){
                return;
            }
        }
    }

    public static void main(String []args){
        int []arr={3,6,7,23,34,45};

        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.println();
        bubbleSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
