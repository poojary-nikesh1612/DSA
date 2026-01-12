package basicrecursion;


import java.util.Arrays;

public class reverseArray {
    //iteration
    public static void revArray(int []arr){
        int n=arr.length;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }
    }

    //recursion
    public static void revArrayRec(int []arr,int l, int r){
        if(l>=r)
            return;
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        revArrayRec(arr,l+1,r-1);
    }

    public static void revArrayRecX(int []arr,int l){
        if(l>=arr.length/2)
            return;
        int temp=arr[l];
        arr[l]=arr[arr.length-1-l];
        arr[arr.length-1-l]=temp;
        revArrayRecX(arr,l+1);
    }

    public static void main(String [] args){
       int []arr={10,20,30,40,50};
       //revArray(arr);
       //revArrayRec(arr,0,arr.length-1);
        revArrayRecX(arr,0);
      for(int x:arr){
          System.out.print(x+" ");
      }

    }
}
