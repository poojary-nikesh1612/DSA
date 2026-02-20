package Array.ArrayHard;

import java.util.ArrayList;
import java.util.Arrays;

public class MissingAndRepeatingNumbers {

    //brute approach
    public static int[] missingAndRepeating(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res=new int[2];

        for(int i=1; i<=arr.size();i++){
            int count=0;
            for(int x:arr){
                if(x==i)
                    count++;
            }
            if(count==0){
                res[0]=i;
            }
            else if(count==2){
                res[1]=i;
            }

            if(res[0]!=0 && res[1]!=0)break;
        }
        return res;
    }

    //better appraoch
    public static int[] missingAndRepeating1(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res=new int[2];
        int[] hash=new int[arr.size()+1];

        for(int x:arr){
            hash[x]=hash[x]+1;
        }

        for(int i=1;i<arr.size()+1;i++){
            if(hash[i]==0)
                res[0]=i;
            else if(hash[i]==2)
                res[1]=i;

            if(res[0]!=0 && res[1]!=0)break;
        }
        return res;
    }

    //optimal1 using math
    public static int[] missingAndRepeating2(ArrayList<Integer> arr, int n) {
        // Write your code here
        int[] res=new int[2];
        long sum1A=0;
        long sum1B=n*(n+1)/2;
        long sum2A=0;
        long sum2B=n*(n+1)*(2*n+1)/6;

        for(int i=0;i<arr.size();i++){
            sum1A+=arr.get(i);
            sum2A+=arr.get(i) * arr.get(i);
        }

        long s1=sum1A-sum1B;
        long s2=(sum2A-sum2B)/s1;

        res[1]=(int)(s1+s2)/2;
        res[0]=(int)s2-res[1];


        return res;
    }

    //optimal2 using XOR
    public static int[] missingAndRepeating3(ArrayList<Integer> arr, int n) {
        // Write your code here
        int xr=0;
        int bitNum=0;

        for(int i=0;i<arr.size();i++){
            xr^=arr.get(i);
            xr^=(i+1);
        }

        while(true){
            if((xr&(1<<bitNum))!=0)break;
            bitNum++;
        }

        int x=0;
        int y=0;

        for(int i=0;i<arr.size();i++){
            int e=arr.get(i);
            if((e&(1<<bitNum))==0){
                x^=e;
            }
            else{
                y^=e;
            }

            if(((i+1)&(1<<bitNum))==0){
                x^=(i+1);
            }
            else{
                y^=(i+1);
            }
        }

        int count=0;
        for(int e:arr){
            if(e==x){
                count++;
            }
        }

        if(count==0){
            return new int[] {x,y};
        }

        return new int[]{y,x};

    }

    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(6, 4, 3, 5, 5, 1));
        int[]res=missingAndRepeating3(arr,arr.size());
        System.out.println(res[0]+" "+res[1]);
    }
}
