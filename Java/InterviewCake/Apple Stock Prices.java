/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testingjava;

public class Problem2 {

    public static int getMaxProfit(int[] stockPricesYesterday) {

        if (stockPricesYesterday.length < 2) {
            throw new IllegalArgumentException("Getting a profit requires at least 2 prices");
        }

        //initialize smallest and max profit
        int minPrice = stockPricesYesterday[0];
        int maxProfit = stockPricesYesterday[1] - stockPricesYesterday[0];

        //loop through the stock prices to get the smallest element
        for (int i = 1; i < stockPricesYesterday.length; i++) {
            
            int currentPrice = stockPricesYesterday[i];
            
            int potentialProfit = currentPrice - minPrice;
            
            // update maxProfit if we can do better
            maxProfit = Math.max(maxProfit, potentialProfit);
            
            minPrice = Math.min(minPrice, currentPrice);

        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] stockPricesYesterday = new int[]{8,2};

        System.out.println(getMaxProfit(stockPricesYesterday));

    }
}
