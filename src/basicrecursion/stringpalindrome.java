package basicrecursion;

import java.util.Scanner;

public class stringpalindrome {

    //iteration
    public static boolean isPalindrome(String s){
        int l=0;
        int r=s.length()-1;

        while(l<r){

            /*addition things to avoid case sensitive
                c1=s.charAt(l);
                c2=s.charAt(r);
                if(c1>='A' && c1<='Z')c1=(char)(c1+32);
                if(c2>='A' && c2<='Z')c2=(char)(c2+32);
                if(c1!=c2) return fase;
             */
            if(s.charAt(l)!=s.charAt(r))
                return false;
            l++;
            r--;
        }

        return true;
    }

    //recursion
    public static boolean isPalindromeRec(String s,int l,int r){
        if(l>=r)
            return true;
        if(s.charAt(l)!=s.charAt(r))
            return false;
        return isPalindromeRec(s,l+1,r-1);
    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(isPalindromeRec(s,0,s.length()-1));
    }
}
