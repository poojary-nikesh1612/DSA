package basicrecursion;

import java.util.Scanner;

public class fibonacci {

    //recursion
    public static int fibonacciNum(int n){
        if(n<=1)return n;
        return fibonacciNum(n-1)+fibonacciNum(n-2);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacciNum(n));
    }
}
