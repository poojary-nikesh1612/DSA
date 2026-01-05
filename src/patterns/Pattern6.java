package patterns;
import java.util.Scanner;

public class Pattern6 {
    static void print(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=(n-i)+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        print(n);
    }
}
