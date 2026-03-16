package BinarySearch.BSonAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PaintersPartition {
    public static int countPainters(ArrayList<Integer> board,long maxLen){
        int painters=1;
        long painterTime=0;

        for(Integer l:board){
            if(painterTime+l<=maxLen){
                painterTime+=l;
            }
            else{
                painters++;
                painterTime=l;
            }
        }
        return painters;
    }
    public static long minTime(ArrayList<Integer> board, int N, int A, int B) {
        // Write your code here.
        long low= Collections.max(board);
        long high=board.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            long mid=low+(high-low)/2;

            int painters=countPainters(board,mid);

            if(painters>A){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low*B;

    }
public static void main(String[]args){
    ArrayList<Integer> board=new ArrayList<>(Arrays.asList(1,8,11,3));
    System.out.println(minTime(board,4,10,1));
}
}
