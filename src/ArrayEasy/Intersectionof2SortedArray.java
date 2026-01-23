package ArrayEasy;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersectionof2SortedArray {
    public static ArrayList<Integer> arrayIntersection(ArrayList<Integer> arr1, int n, ArrayList<Integer> arr2, int m) {
        // Write Your Code Here.
        ArrayList<Integer> arr = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (arr1.get(i).equals(arr2.get(j))) {
                arr.add(arr1.get(i));
                i++;
                j++;
            } else if (arr1.get(i) < arr2.get(j)) {
                i++;
            } else {
                j++;
            }
        }

        return arr;
    }

    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>(Arrays.asList(1, 2, 2, 4, 5, 5, 7));
        ArrayList<Integer> a2 = new ArrayList<>(Arrays.asList(1, 3, 4, 5, 5, 9));

        ArrayList<Integer> union = arrayIntersection(a1, a1.size(), a2, a2.size());
        for (int x : union) {
            System.out.print(x + " ");
        }
    }
}
