package org.orca.leetcode.strings;

public class ReverseInteger {

  private final ReverseString reverseString = new ReverseString();

  public int reverse(int x) {

    final boolean isNegative = x < 0;

    final long normalizedNumber = isNegative ? x * -1L : x;

    final char[] numAsStr = Long.toString(normalizedNumber).toCharArray();

    reverseString.reverseString(numAsStr);

    final String eventualNumAsStr;

    if (isNegative){
      eventualNumAsStr = "-" + String.valueOf(numAsStr);
    } else {
      eventualNumAsStr = String.valueOf(numAsStr);
    }

    final long longNumber = Long.parseLong(eventualNumAsStr);

    if (longNumber > Integer.MAX_VALUE || longNumber < Integer.MIN_VALUE) {
      return 0;
    } else{
      return (int)longNumber;
    }

  }

  public static void main(final String[] args) {

    final ReverseInteger reverseInteger = new ReverseInteger();

    final int reversedInteger = reverseInteger.reverse(-120);

    System.out.println(reversedInteger);

  }

}
