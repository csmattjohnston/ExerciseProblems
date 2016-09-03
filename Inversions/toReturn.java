//Matt Johnston
//Return inversions class
//2/28/14

package inverstions;
import java.util.*;

/*
class creates an instance of the toReturn array
*/
public class toReturn {
    
    //Variables
    ArrayList<Integer> a = new ArrayList<>();
    public int count;
    
    /*
    Constructor
    */
    public toReturn(ArrayList<Integer> a,int count){
        this.a = a;
        this.count = count;
    }
    @Override
    public String toString(){
        return "Sorted " + a + " Inversions " + count; 
    }
}
