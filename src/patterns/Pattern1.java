package patterns;
import java.util.Scanner;

public class Pattern1 {

    static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int t=Integer.parseInt(args[0]);
       for(int i=1;i<=t;i++){
           int n=Integer.parseInt(args[i]);
           print(n);
           System.out.println();
       }
    }
}
