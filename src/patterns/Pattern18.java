package patterns;
import java.util.Scanner;

public class Pattern18 {
    static void print(int  n){
        for(int i=0;i<n;i++){
            char ch=(char)('A'+(n-1-i));
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
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
