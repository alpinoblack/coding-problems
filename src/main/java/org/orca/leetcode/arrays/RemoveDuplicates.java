package org.orca.leetcode.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

  public int removeDuplicates(int[] nums) {

    if (nums != null && nums.length > 1) {

      int indexOfFirstUnique = 0;
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[indexOfFirstUnique]) {
          nums[++indexOfFirstUnique] = nums[i];
        }
      }

      return indexOfFirstUnique + 1;
    }

    return nums.length;
  }


  public static void main(final String[] args) {

    final RemoveDuplicates rotateArray = new RemoveDuplicates();

    final int[] ints = {1,2,2};

    final int newLength = rotateArray.removeDuplicates(ints);

    System.out.println(Arrays.toString(ints));
    System.out.println(newLength);

  }

}
