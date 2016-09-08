
package testingjava;

import java.util.Arrays;


public class Problem3 {
    
    public static int [] getProductsOfAllIntsExceptAtIndex (int [] indiciesToTest){
        int productSoFar = 1;
        int [] productSoFarList = new int[indiciesToTest.length];
        
        for(int i = 0; i < indiciesToTest.length;i++){
            int currentValue = indiciesToTest[i];
            productSoFarList[i] = productSoFar;
            productSoFar *=currentValue;
           
        }
        productSoFar = 1;
        
        for(int i = indiciesToTest.length -1;i>=0;i--){
            int currentValue = indiciesToTest[i];
            productSoFarList[i] = productSoFar;
            productSoFar *=currentValue;
           
        }
        
        return productSoFarList;
    }
    
    public static void main(String [] args){
        int [] array = {1,2, 6, 5,9};
        
        System.out.println(Arrays.toString(getProductsOfAllIntsExceptAtIndex(array)));
    }
}
