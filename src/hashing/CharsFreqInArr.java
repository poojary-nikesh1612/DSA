package hashing;

import java.util.Scanner;

public class CharsFreqInArr {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char []arr=new char[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next().charAt(0);
        }

        int []hash=new int[26];
        for(int i=0;i<n;i++){
            hash[arr[i]-'a']+=1;
        }
        int q=sc.nextInt();
        while(q>0){
            char c=sc.next().charAt(0);
            System.out.println(hash[c-'a']);
            q--;
        }
    }
}
