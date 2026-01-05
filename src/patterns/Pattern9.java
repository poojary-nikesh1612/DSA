package patterns;
import java.util.Scanner;

public class Pattern9 {
    static void print1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            for(int j=0;j<(i*2)+1;j++){
                System.out.print("* ");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    static void print2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<2*(n-i);j++){
                System.out.print("* ");
            }
            for(int j=0;j<i;j++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print1(n);
        print2(n);
    }
}
