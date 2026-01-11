package basicmaths;

import java.util.Scanner;

public class ArmstrongNum {

    public static boolean isArmstrong(int num)
    {
        int count=0;
        int x=num;
        int sum=0;
        while(x!=0){
            x/=10;
            count++;
        }
        x=num;
        while(x!=0){
            sum+=(int)Math.pow(x%10,count);
            x/=10;
        }
        return sum==num;
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( isArmstrong(n));
    }
}
