package org.orca.leetcode.arrays;

import java.util.Arrays;

public class RotateArray {

  /**
   * @param nums initial array
   * @param k amount of shift right
   */
  public void rotate(final int[] nums, final int k) {

    if (nums != null && nums.length > 1 && k > 0){

      final int effectiveRotation = k > nums.length ? k % nums.length : k;

      if (effectiveRotation > 0){

        final int[] numsCopy = Arrays.copyOf(nums, nums.length);

        final int pivot = nums.length - effectiveRotation;

        for (int i = pivot; i < nums.length; i++){

          nums[i - pivot] = numsCopy[i];

        }

        for (int i = effectiveRotation; i < nums.length; i++){

          nums[i] = numsCopy[i - effectiveRotation];

        }


      }

    }


  }


  public static void main(final String[] args) {

    final RotateArray rotateArray = new RotateArray();

    final int[] ints = {1,2};

    rotateArray.rotate(ints, 3);

    System.out.println(Arrays.toString(ints));

  }

}
