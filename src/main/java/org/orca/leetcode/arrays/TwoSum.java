package org.orca.leetcode.arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

  public int[] twoSum(int[] nums, int target) {

    final HashMap<Integer, Integer> numberAndIndexMap = new HashMap<>();

    for (int i = 0; i < nums.length; i ++){

      final int complement = target - nums[i];

      final Integer complementIndex = numberAndIndexMap.get(complement);

      if (complementIndex == null){
        numberAndIndexMap.put(nums[i], i);
      } else {
        return new int[]{i, complementIndex};
      }

    }

    return null;


  }

  public static void main(final String[] args) {

    final TwoSum twoSum = new TwoSum();

    final int[] ints = {2, 7, 11, 15};

    final int[] requestedPair = twoSum.twoSum(ints, 9);

    System.out.println(Arrays.toString(requestedPair));

  }

}
