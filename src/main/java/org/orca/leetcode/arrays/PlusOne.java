package org.orca.leetcode.arrays;

import java.util.Arrays;

public class PlusOne {

  public int[] plusOne(int[] digits) {

    for (int i = digits.length - 1; i >= 0; i--){

      if (digits[i] == 9){
        if (i == 0){
          final int[] newDigitsArr = new int[digits.length + 1];
          newDigitsArr[0] = 1;
          newDigitsArr[1] = 0;
          for (int j = 2; j < digits.length; j++){
            newDigitsArr[j+1] = digits[j];
          }
          return newDigitsArr;
        }
        digits[i] = 0;
      } else {
        digits[i]++;
        return digits;
      }

    }

    return digits;

  }


  public static void main(String[] args) {
    final PlusOne plusOne = new PlusOne();

    final int[] ints = {9};

    final int[] newNumber = plusOne.plusOne(ints);

    System.out.println(Arrays.toString(newNumber));

  }

}
