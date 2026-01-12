package basicrecursion;

import java.util.Scanner;

public class print1ton {

    public static void printNumToN(int num,int n){
        if(num>n)
            return;
        System.out.print(num+" ");
        printNumToN(++num,n);
    }

    public static void printNumToNBacktrack(int num,int n){
        if(num>n)
            return;
        printNumToNBacktrack(num+1,n);
        System.out.print(num+" ");
    }

    public static void printNumFromN(int num){
        if(num==0)
            return;
        System.out.print(num+" ");
        printNumFromN(--num);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printNumToN(1,n);
        System.out.println();
        printNumFromN(n);
        System.out.println();
        printNumToNBacktrack(1,n);
    }
}
