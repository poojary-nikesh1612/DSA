package hashing;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class LowORHighFreq {

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer>hash=new HashMap<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }

        for(Integer key:hash.keySet()){
            if(hash.get(key)>max){
                max=hash.get(key);
            }
            else if(hash.get(key)<min){
                min=hash.get(key);
            }
        }
        for(int i=0;i<n;i++){

            if(hash.get(arr[i])>max){
                max=hash.get(arr[i]);
            }
            else if(hash.get(arr[i])<min){
                min=hash.get(arr[i]);
            }
        }

        System.out.println("Lowest Frequency:"+min+"\nHigh Frequency:"+max );
    }
}
