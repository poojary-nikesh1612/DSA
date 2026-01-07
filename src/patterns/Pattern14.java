package patterns;
import java.util.Scanner;

public class Pattern14 {
    static void print(int n){
        for(int i=0;i<n;i++){
           for(char ch='A';ch<='A'+i;ch++){
               System.out.print(ch+" ");
           }
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
