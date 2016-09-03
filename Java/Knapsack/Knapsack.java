//Matt Johnston
//Knapsack algorithm
//3/8/15
package knapsack;

import java.util.*;

public class Knapsack {

    //declare 2D array
    public static ArrayList<Node> OPT = new ArrayList<>();
    public static ArrayList<Node> sub = new ArrayList<>();
    /*
     Knapsack figures out the most optimal set
     */

    public static void Knapsack(int W) {
        int M[][] = new int[OPT.size()][W + 1];

        //Set values to 0, base case
        for (int[] singleM : M) {
            for (int w = 0; w < W; w++) {
                singleM[w] = 0;
            }
        }

        //test using the knapsack
        for (int i = 0; i < OPT.size(); i++) {
            for (int w = 1; w <= W; w++) {
                //constraint on the bounds so there is no out of bounds error
                if (i == 0) {
                    M[i][w] = OPT.get(i).weight;
                } else {
                    //if current weight is larger than w
                    if (OPT.get(i).weight > w) {
                        M[i][w] = M[i - 1][w];
                    } else {
                        //else find the max
                        M[i][w] = Math.max(M[i - 1][w], OPT.get(i).data + (M[i - 1][w - OPT.get(i).weight]));

                    }
                }
            }

        }
        System.out.println("W = " + W);
        System.out.println("------------------------------------------");
        //print array
        for (int[] array : M) {
            System.out.println(Arrays.toString(array));
        }
        //get last item in the 2d Array to find optimal set
        int lastItem = M[M.length - 1][M[M.length - 1].length - 1];
        System.out.println("Optimal Value = " + lastItem);

        //loop through the data values 
        for (int i = 0; i < OPT.size(); i++) {
            int firstData = OPT.get(i).data;
            for (int other = i; other < OPT.size(); other++) {
                //test if the data values equal the lats item
                if (firstData + OPT.get(other).data == lastItem) {
                    //add to the set
                    sub.add(OPT.get(i));
                    sub.add(OPT.get(other));
                }

            }
            //if the optimal subset hasnt been found
            if (i == OPT.size() - 1 && sub.isEmpty()) {
                //get the max data value from the table
                int max = OPT.get(0).data;
                //find max
                if (OPT.get(i).data > max) {
                    max = OPT.get(i).data;
                }
                //add the max value to the subset
                sub.add(OPT.get(i));

                //loop to find the values that add to the optimal value
                for (int v = OPT.size() - 1; v >= 0; v--) {
                    if (!(OPT.get(v).data + max > lastItem)) {
                        sub.add(OPT.get(v));
                    }

                }
            }
        }
        System.out.println("Optimal Set = " + sub);
        //clear subset for next W
        sub.clear();
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        //Create table of nodes
        Node v1 = new Node(1, 1);
        Node v2 = new Node(6, 2);
        Node v3 = new Node(18, 5);
        Node v4 = new Node(22, 6);
        Node v5 = new Node(28, 7);

        //Add node to arraylist
        OPT.add(v1);
        OPT.add(v2);
        OPT.add(v3);
        OPT.add(v4);
        OPT.add(v5);

        //Call knapsack with max weight 11
        Knapsack(11);
        Knapsack(10);
    }

}
