package patterns;
import java.util.Scanner;
public class Pattern19 {
    static void print(int n){
        int space=0;
        for(int i=0;i<n;i++){

            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("* ");
            }
            space+=2;
            System.out.println();
        }
        space=2*n-2;
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            space-=2;
            System.out.println();
        }
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
