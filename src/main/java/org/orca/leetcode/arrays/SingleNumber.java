package org.orca.leetcode.arrays;


public class SingleNumber {

  public int singleNumber(int[] nums) {

    int accumulatedXor = nums[0];

    for (int i = 1; i < nums.length; i++){
      accumulatedXor = accumulatedXor ^ nums[i];
    }

    return accumulatedXor;

  }

  public static void main(final String[] args) {

    final SingleNumber singleNumber = new SingleNumber();

    final int[] ints = {1,1,2,2,3,4,3};

    final int uniqueSingleNumber = singleNumber.singleNumber(ints);

    System.out.println(uniqueSingleNumber);

  }

}
