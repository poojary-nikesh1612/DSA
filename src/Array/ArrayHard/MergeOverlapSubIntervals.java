package Array.ArrayHard;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

 class Interval {
     int start;
     int end;

     Interval(int start, int end) {
         this.start = start;
         this.end = end;
     }
 }

public class MergeOverlapSubIntervals {

     //optimal soln wrote in leetcode
     public static int[][] merge(int[][] intervals) {
         int n=intervals.length;
         ArrayList<int[]> res=new ArrayList<>();

         Arrays.sort(intervals,(a, b)->a[0]!=b[0]?Integer.compare(a[0],b[0]):Integer.compare(a[1],b[1]));

         for(int i=0;i<n;i++){
             int k=res.size()-1;
             if(res.isEmpty() ||res.get(k)[1]<intervals[i][0]){
                 res.add(new int[]{intervals[i][0],intervals[i][1]});
             }
             else{
                 if(res.get(k)[1]<intervals[i][1]){
                     res.get(k)[1]=intervals[i][1];
                 }
             }
         }

         int[][] ans=new int[res.size()][2];

         for(int i=0;i<res.size();i++){
             ans[i]=res.get(i);
         }
         return ans;
     }

     //brute soln wrote in code360 problem
    public static ArrayList<Interval> mergeIntervals(ArrayList<Interval> intervals) {
        // Write your code here.
        ArrayList<Interval> res=new ArrayList<>();

        Collections.sort(intervals,(a,b)->a.start!=b.start? Integer.compare(a.start,b.start):Integer.compare(a.end,b.end));

        for(int i=0;i<intervals.size();i++){
            int k=res.size()-1;
            if(!res.isEmpty() && res.get(k).end>=intervals.get(i).end)
                continue;

            res.add(new Interval(intervals.get(i).start,intervals.get(i).end));

            int j=i+1;

            while(j<intervals.size() && res.get(k+1).end >=intervals.get(j).start){
                if(res.get(k+1).end<intervals.get(j).end){
                    res.get(k+1).end=intervals.get(j).end;
                }
                j++;
            }
        }

        return res;
    }



    public static void main(String[]args){
//        ArrayList<Interval> intervals=new ArrayList<>();
//        intervals.add(new Interval(1,3));
//        intervals.add(new Interval(2,6));
//        intervals.add(new Interval(8,10));
//        intervals.add(new Interval(15,18));
//
//        ArrayList<Interval> res=mergeIntervals(intervals);
//
//        for(Interval x:res){
//            System.out.println("("+x.start+" , "+x.end+")");
//        }

        int[][] intervals={{1,3},{2,6},{8,10},{15,18}};

        int[][] ans=merge(intervals);

        for(int[] row:ans){
            System.out.println("("+row[0]+" , "+row[1]+")");
        }
    }
}




