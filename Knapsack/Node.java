//Matt Johnston
//Knapsack
//March 14,2015

package knapsack;

import java.util.*;

public class Node {

    public int data,weight; //Stores the data for the node
    public ArrayList<Node> adjacentNodes = new ArrayList();//Adjacent Nodes list

    /*
     **Constructor for Node class
     */
    public Node(int data, int weight) {
        this.data = data;
        this.weight = weight;

    }
    /*
     **Override to string method
     */

    @Override
    public String toString() {
        return "{data = " + data + "" + ", weight " + weight + "}";
    }
}
