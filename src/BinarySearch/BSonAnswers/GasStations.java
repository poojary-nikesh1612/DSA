package BinarySearch.BSonAnswers;
import java.util.PriorityQueue;

class Pair{
    double gap;
    int index;

    Pair(double gap,int index){
        this.gap=gap;
        this.index=index;
    }
}
public class GasStations {

    public static int numOfGasStations(int[]arr,double dist){
        int cnt=0;

        for(int i=1;i<arr.length;i++){
            int numInBtn=(int)((arr[i]-arr[i-1])/dist);

            if(numInBtn*dist==(arr[i]-arr[i-1])){
                numInBtn--;
            }
            cnt+=numInBtn;
        }
        return cnt;
    }

    //optimal soln uisng binary search
    public static double MinimiseMaxDistance1(int []arr, int K){
        // Write your code here.
        int n=arr.length;
        double low=0.0;

        double high=arr[0];

        for(int i=1;i<arr.length;i++){
            high=Math.max(high,arr[i]);
        }

        while(high-low>1e-6){
            double mid=(high+low)/2.0;
            int cnt=numOfGasStations(arr,mid);

            if(cnt>K){
                low=mid;
            }
            else{
                high=mid;
            }

        }
        return high;
    }

    //better soln using max heap data structure
    public static double MinimiseMaxDistance(int []arr, int K){
        // Write your code here.
        int n=arr.length;

        int[] howmany=new int[n-1];
        PriorityQueue<Pair>heap=new PriorityQueue<>((a,b)->Double.compare(b.gap,a.gap));

        for(int i=0;i<n-1;i++){
            heap.add(new Pair(arr[i+1]-arr[i],i));
        }

        for(int i=1;i<=K;i++){
            Pair p=heap.poll();
            int SecInd=p.index;
            howmany[SecInd]++;
            double diff=arr[SecInd+1]-arr[SecInd];

            double newSecLength=diff/(double)(howmany[SecInd]+1);
            heap.add(new Pair(newSecLength,SecInd));
        }
        return heap.peek().gap;
    }

    public static void main(String[]args){
        int[]arr={1,2,3,4,5,6,7};
        System.out.println(MinimiseMaxDistance1(arr,6));
    }
}
