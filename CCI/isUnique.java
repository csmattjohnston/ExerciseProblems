package cci;

import java.util.HashSet;
/**
I have declared a function to return a boolean if the string has duplicate characters
Total run time of this is O(s) where s is the length of the string
I used a hashSet because they do not support duplicate values and so comparing the length of the set vs the string will be returned

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
