package Array.ArrayHard;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<Integer> generateRow(int n){
        List<Integer> list=new ArrayList<>();
        int ans=1;
        list.add(ans);
        for(int i=1;i<n;i++){
            ans=ans*(n-i);
            ans=ans/i;
            list.add(ans);
        }
        return list;

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }

    public static void main(String[]args){
      List<List<Integer>> res=  generate(5);

      for(List<Integer> l:res){
          for(Integer x:l){
                System.out.print(x+" ");
          }
          System.out.println();
      }
    }
}
