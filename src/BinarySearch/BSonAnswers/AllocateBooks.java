package BinarySearch.BSonAnswers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class AllocateBooks {
    public static int countStudent(ArrayList<Integer> arr,int pages){
        int student=1;
        int pageStudent=0;

        for(Integer page:arr ){
            if(pageStudent+page<=pages){
                pageStudent+=page;
            }
            else{
                student++;
                pageStudent=page;
            }
        }
        return student;
    }
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        // Write your code here.
        if(n<m) return -1;

        int low= Collections.max(arr);
        int high=arr.stream().mapToInt(Integer::intValue).sum();

        while(low<=high){
            int mid=low+(high-low)/2;
            int student=countStudent(arr,mid);
            if(student>m){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

    }

    public static void main(String[]args){
        ArrayList<Integer> arr=new ArrayList<>(Arrays.asList(12,34,67,90));
        System.out.println(findPages(arr,arr.size(),2));
    }

}
