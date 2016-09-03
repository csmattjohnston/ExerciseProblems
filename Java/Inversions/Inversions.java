//Matt Johnston
//inversions class
//2/28/14
package inverstions;

import java.util.*;

public class Inversions {

    //declare sorted array and counter
    public static ArrayList<Integer> sorted = new ArrayList<>();
    public static int count = 0;
    public static toReturn t;

    public static void DC(int[] left, int[] right) {
        //loop through right array then all the elements in left array
        for (int j = 0; j < right.length; j++) {
            System.out.println("Right(j) = " + right[j]);
            for (int i = 0; i < left.length; i++) {
                //if left side is bigger than right,start a new count
                if (left[i] > right[j]) {
                    //incremement count
                    count++;
                    t = new toReturn(sorted, count);
                    //set count
                    t.count = count;
                } else {
                    //adding the left(i) that are smaller than right(j) to sorted array
                    if (!sorted.contains(left[i])) {
                        sorted.add(left[i]);
                    }

                }
            }
            //add the right(j) element to the sorted array
            sorted.add(right[j]);
            t = new toReturn(sorted, count);
            //reset count
            count = 0;
            System.out.println(t);
            System.out.println("");
            t.count = 0;
        }

    }

    public static void main(String[] args) {
        //declare inital array
        int[] a = new int[]{1, 5, 4, 8, 10, 2, 6, 9, 12, 11, 3, 7};
        //split array in half
        int[] left = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] right = Arrays.copyOfRange(a, a.length / 2, a.length);
        //sort both arrays
        Arrays.sort(left);
        Arrays.sort(right);
        System.out.println("++++++++++++++++++++++++++"
                + "++++++++++++++++++++++++++++++");
        System.out.println("INITIAL ARRAY: " + Arrays.toString(a));
        System.out.println("++++++++++++++++++++++++++"
                + "++++++++++++++++++++++++++++++" + "\n");
        System.out.println("SORTED Left " + Arrays.toString(left) + " SORTED Right " + Arrays.toString(right) + "\n");
        //method call
        DC(left, right);
    }

}
