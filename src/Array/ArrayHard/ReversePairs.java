package Array.ArrayHard;

public class ReversePairs {

    public static int sort(int[]nums,int l,int r){
        int cnt=0;

        if(l==r)return cnt;

        int mid=(l+r)/2;
        cnt+=sort(nums,l,mid);
        cnt+=sort(nums,mid+1,r);
        cnt+=countPairs(nums,l,mid,r);
        merge(nums,l,mid,r);
        return cnt;
    }

    public static void merge(int[]nums,int l, int mid, int r){
        int[] temp=new int[(r-l)+1];

        int p=l;
        int q=mid+1;
        int index=0;

        while(p<=mid && q<=r){
            if(nums[p]<=nums[q]){
                temp[index++]=nums[p++];
            }
            else{
                temp[index++]=nums[q++];
            }
        }

        while(p<=mid){
            temp[index++]=nums[p++];
        }

        while(q<=r){
            temp[index++]=nums[q++];
        }
        for(int i=0;i<temp.length;i++){
            nums[i+l]=temp[i];
        }
    }

    public static int countPairs(int[]nums,int l,int mid,int r){
        int temp=mid+1;
        int cnt=0;
        for(int i=l;i<=mid;i++){
            while(temp<=r && (long)nums[i]>2L*nums[temp])temp++;
            cnt+=temp-(mid+1);
        }
        return cnt;
    }
    public static int reversePairs(int[] nums) {
        return sort(nums,0,nums.length-1);
    }

    public static void main(String[]args){
        int[]arr={1,3,2,3,1};
        System.out.println(reversePairs(arr));
    }
}
