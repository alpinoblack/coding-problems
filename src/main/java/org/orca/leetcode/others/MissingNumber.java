package org.orca.leetcode.others;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {

  public int missingNumber(int[] nums) {

    final int numberOfElementsInTheRange = nums.length + 1;

    final int actualSum = Arrays.stream(nums).sum();

    final int desiredSum =  (numberOfElementsInTheRange * (numberOfElementsInTheRange - 1))/2;

    return desiredSum - actualSum;

  }

  public static void main(final String[] args) {

    final MissingNumber missingNumber = new MissingNumber();

    final int[] missing89 = IntStream.range(0, 100).filter(integer -> integer != 89)
        .toArray();

    System.out.println(missingNumber.missingNumber(missing89));

  }

}
