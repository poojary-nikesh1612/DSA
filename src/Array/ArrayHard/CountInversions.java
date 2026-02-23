package Array.ArrayHard;

public class CountInversions {

    public static long sort(long[] arr,int l,int r){
        long count=0;
        if(l==r) return count;;

        int mid=(l+r)/2;

        count+=sort(arr,l,mid);
        count+=sort(arr,mid+1,r);
        count+=merge(arr,l,mid,r);
        return count;

    }

    public static long merge(long[]arr,int l, int mid, int r){
        long[] temp=new long[(r-l)+1];
        int p=l;
        int q=mid+1;
        int index=0;
        long count=0;

        while(p<=mid && q<=r){
            if(arr[p]<=arr[q]){
                temp[index++]=arr[p++];
            }
            else{
                count=count+(mid-p)+1;
                temp[index++]=arr[q++];
            }
        }

        while(p<=mid){
            temp[index++]=arr[p++];
        }

        while(q<=r){
            temp[index++]=arr[q++];
        }

        p=l;

        while(p<=r){
            arr[p]=temp[p-l];
            p++;
        }

        return count;
    }
    public static long getInversions(long arr[], int n) {
        // Write your code here.
        return sort(arr,0,n-1);
    }

    public static void main(String[]args){
        long[]arr={2,5,1,3,4};

        System.out.println(getInversions(arr,arr.length));
    }
}
