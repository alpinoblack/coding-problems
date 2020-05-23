package org.orca.leetcode.strings;

public class Atoi {

  private int createNewNumber(final String numStr, final boolean isPositive){

    long accumulatedNum = 0L;
    int powerOf10 = 0;

    for (int i = numStr.length() - 1; i >= 0; i--){

        accumulatedNum += Character.getNumericValue(numStr.charAt(i)) * Math.pow(10, powerOf10);

        if (isPositive && accumulatedNum > Integer.MAX_VALUE){
          return Integer.MAX_VALUE;
        } else if (!isPositive && (accumulatedNum * -1L) < Integer.MIN_VALUE){
          return Integer.MIN_VALUE;
        }

        powerOf10++;

      }

    if (isPositive){
      return (int)accumulatedNum;
    } else {
      return (int)accumulatedNum * -1;
    }


  }

  private boolean isPlusMinus(final char partOfTheNumber){
    return partOfTheNumber == '+' || partOfTheNumber == '-';
  }

  public int myAtoi(String str) {

    final String trimmedStr = str.trim();
    boolean isPositive = true;
    boolean isFirstDigitSign = false;

    if (trimmedStr.isEmpty()){
      return 0;
    }

    final StringBuilder stringBuilder = new StringBuilder(trimmedStr.length());

    final char firstDigit = trimmedStr.charAt(0);

    if (isPlusMinus(firstDigit)) {
      isFirstDigitSign = true;
      switch (firstDigit) {
        case '-':
          isPositive = false;
          break;
        case '+':
          isPositive = true;
          break;
        default:
          return 0;
      }
    } else if (!Character.isDigit(firstDigit)){
      return 0;
    }


    final int firstDigitIndex = isFirstDigitSign ? 1 : 0;
    boolean hasSeenFirstNonZero = false;

    for (int i = firstDigitIndex; i < trimmedStr.length(); i++){

      if (!Character.isDigit(trimmedStr.charAt(i))){
        break;
      } else {
        if (trimmedStr.charAt(i) != '0'){
          hasSeenFirstNonZero = true;
          stringBuilder.append(trimmedStr.charAt(i));
        } else if (hasSeenFirstNonZero) {
          stringBuilder.append(trimmedStr.charAt(i));
        }
      }

    }

    return createNewNumber(stringBuilder.toString(), isPositive);

  }

  public static void main(final String[] args) {

    final Atoi atoi = new Atoi();
    System.out.println(atoi.myAtoi("3.14159"));
    System.out.println(atoi.myAtoi("4193 with words"));
    System.out.println(atoi.myAtoi("  -0012a42"));
    System.out.println(atoi.myAtoi("010"));

  }

}
