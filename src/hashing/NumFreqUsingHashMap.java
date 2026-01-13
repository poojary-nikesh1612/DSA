package hashing;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class NumFreqUsingHashMap {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        HashMap<Integer,Integer> hash=new HashMap<>();
        int n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        int q=sc.nextInt();
        while(q>0){
            int num=sc.nextInt();
            System.out.println(hash.get(num));
            q--;
        }
        for(Map.Entry<Integer,Integer> e:hash.entrySet()){
            System.out.println(e.getKey()+"="+e.getValue());
        }
    }
}
