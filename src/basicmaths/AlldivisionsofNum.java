package basicmaths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AlldivisionsofNum {

    public static List< Integer > printDivisors(int n) {
        List<Integer> list=new ArrayList<>();

        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                list.add(i);
                if(n/i!=i)
                    list.add(n/i);
            }

        }
        Collections.sort(list);
        return list;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println( printDivisors(n));
    }
}
