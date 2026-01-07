package patterns;
import java.util.Scanner;

public class Pattern20 {
    static void print(int n){
        int stars;
        int space=2*n;
        for(int i=1;i<2*n;i++){

            if(i>n){
                stars=2*n-i;
                space+=2;
            }
            else{
                stars=i;
                space-=2;
            }


            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=space;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
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
