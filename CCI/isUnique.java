package cci;

import java.util.HashSet;
/**
 *
 * @author Sir
 */
public class isUnique {

    //problem 1.1
    public static boolean isUnique(String s) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            set.add(s.substring(i, i+1));
        }
        
        return set.size() == s.length();
    
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        isUnique("true");
    }

}
