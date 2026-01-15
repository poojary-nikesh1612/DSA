package Sorting2;

public class MergeSort {



    public static void mergeSort(int []arr,int l,int r){
        if(l==r) return;

        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    public static void merge(int []arr,int l,int mid,int r){
        int i=l;
        int j=mid+1;
        int k=0;
        int [] tempArr=new int[(r-l)+1];
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                tempArr[k++]=arr[i++];
            }
            else{
                tempArr[k++]=arr[j++];
            }
        }

        while(i<=mid){
            tempArr[k++]=arr[i++];
        }
        while(j<=r){
            tempArr[k++]=arr[j++];
        }

        for(i=l,k=0;i<=r;i++,k++){
            arr[i]=tempArr[k];
        }
    }

    public static void main(String []args){
        int []arr={5,4,3,2,1};
        for(int x:arr){
            System.out.print(x+" ");
        }
        mergeSort(arr,0,arr.length-1);
        System.out.println();
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
