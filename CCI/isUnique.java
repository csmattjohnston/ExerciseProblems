package javaapplication2;
import java.util.HashSet;
/**
 *
 * @author Sir
 */
public class isUnique {

    //problem 1.1
    public static boolean isUnique(String s) {
        HashSet set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        
        return set.size() == s.length();
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println(isUnique("Tt"));
    }

}
