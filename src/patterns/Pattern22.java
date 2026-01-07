package patterns;
import java.util.Scanner;

public class Pattern22 {
    static void print(int n){
        int top,left,right,down,val;
        for(int i=0;i<2*n-1;i++){
            for(int j=0;j<2*n-1;j++){
                top=i;
                left=j;
                right=2*n-2-j;
                down=2*n-2-i;
                val=n-Math.min(Math.min(top,down),Math.min(left,right));
                System.out.print(val+" ");
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
