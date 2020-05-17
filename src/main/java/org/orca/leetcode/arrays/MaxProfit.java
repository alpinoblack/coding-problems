package org.orca.leetcode.arrays;

public class MaxProfit {

  public int maxProfit(int[] prices) {

    int currentProfit = 0;

    if (prices.length > 1){

      int worthOfStockAtBuyDay = prices[0];
      int currentPrice = worthOfStockAtBuyDay;

      for (int i = 1; i < prices.length; i++){

        if (currentPrice >= prices[i] || i == prices.length - 1){

          if (i == prices.length - 1){

            if (prices[i] > currentPrice) {
              currentProfit += prices[i] - worthOfStockAtBuyDay;
            } else {
              currentProfit += currentPrice - worthOfStockAtBuyDay;
            }

          } else {
            currentProfit += currentPrice - worthOfStockAtBuyDay;

            currentPrice = prices[i];
            worthOfStockAtBuyDay = currentPrice;
          }

        } else {
          currentPrice = prices[i];
        }

      }

      return currentProfit;

    } else {
      return currentProfit;
    }

  }


  public static void main(final String[] args) {

    final MaxProfit maxProfitCalculator = new MaxProfit();

    final int[] ints = {7,1,5,3,6,4};

    final int maxProfit = maxProfitCalculator.maxProfit(ints);

    System.out.println(maxProfit);

  }

}
