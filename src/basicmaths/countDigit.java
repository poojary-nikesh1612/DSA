package basicmaths;
import java.util.Scanner;

public class countDigit {
    public static int count(int n){
        int count=0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
        //OR
//        return (int) Math.log10(n)+1;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
       System.out.println( count(n));
    }
}
