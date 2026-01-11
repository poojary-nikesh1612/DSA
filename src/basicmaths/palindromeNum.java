package basicmaths;

import java.util.Scanner;

public class palindromeNum {

    public static boolean palindrome(int x){
        if(x<0)return false;

        int num=x;
        int rev=0;
        while(num!=0){
            rev=rev*10+num%10;
            num/=10;
        }
        return rev==x;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( palindrome(n));
    }
}
