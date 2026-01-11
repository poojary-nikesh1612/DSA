package basicmaths;

import java.util.Scanner;

public class reverseNum {

    //int return, while rev>int return 0
    public static int reverseInt(int x) {
        long rev=0;
        while(x!=0){
            int temp=x%10;
            rev=rev*10+temp;
            x/=10;
        }
        if(rev<Integer.MIN_VALUE || rev>Integer.MAX_VALUE)
            return 0;
        return (int)rev;
    }

    //long return
    public static long reverseLong(long n) {
        long rev=0;
        long temp=0;
        while(n!=0){
            temp=n%10;
            rev=rev*10+temp;
            n/=10;
        }
        return rev;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( reverseInt(n));
        System.out.println( reverseLong(n));
    }
}
