package org.orca.leetcode.strings;

import java.util.Arrays;

public class ValidPalindrome {

  final private ReverseString reverseString = new ReverseString();

  public boolean isPalindrome(String s) {

    final String filteredString = s.replaceAll("[^a-zA-Z0-9]", "");

    final char[] reversedCharArr = Arrays.copyOf(filteredString.toCharArray(), filteredString.length());

    reverseString.reverseString(reversedCharArr);

    return String.valueOf(reversedCharArr).equalsIgnoreCase(filteredString);

  }

  public static void main(final String[] args) {

    final ValidPalindrome validPalindrome = new ValidPalindrome();

    System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));


  }



}
