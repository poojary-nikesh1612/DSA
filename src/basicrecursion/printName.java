package basicrecursion;

import java.util.Scanner;

public class printName {

    public static void printNames(String name,int n){
        if(n==0)
            return;
        System.out.println(name);

        printNames(name,--n);
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int n=sc.nextInt();
        printNames(name,n);
    }
}
