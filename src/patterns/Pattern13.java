package patterns;
import java.util.Scanner;

public class Pattern13 {
    static void print(int n){
        int start=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(start+" ");
                start++;
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
