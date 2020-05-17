package org.orca.leetcode.arrays;

import java.util.Arrays;

public class ContainsDuplicates {

  public boolean containsDuplicate(int[] nums) {

    Arrays.sort(nums);

    for (int i  = 0; i < nums.length; i++){

      if (i + 1 < nums.length){
        if (nums[i] == nums[i + 1]){
          return true;
        }
      }

    }

    return false;

  }


  public static void main(final String[] args) {

    final ContainsDuplicates containsDuplicates = new ContainsDuplicates();

    final int[] ints = {1,2};

    final boolean isContainDuplicates = containsDuplicates.containsDuplicate(ints);

    System.out.println(isContainDuplicates);

  }

}
