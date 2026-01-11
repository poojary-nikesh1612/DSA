package basicmaths;

import java.util.Scanner;

public class GCD {

    public static int gcd(int a, int b){
        while(a>0 && b>0){
            if(a>b)a%=b;
            else b%=a;
        }
        if(a==0)return b;
        else return a;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        System.out.println( gcd(n1,n2));
    }
}
