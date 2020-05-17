package org.orca.leetcode.strings;

public class FirstUniqueChar {

  public int firstUniqChar(String s) {

    final int[] letterHistogram = new int[26];

    final char[] chars = s.toCharArray();

    for (int i = 0; i < chars.length; i++){
      letterHistogram[chars[i] - 97]++;
    }

    for (int i = 0; i < chars.length; i++){
      if (letterHistogram[chars[i] - 97] == 1){
        return s.indexOf(chars[i]);
      }
    }

    return -1;
  }

  public static void main(final String[] args) {

    final FirstUniqueChar firstUniqueChar = new FirstUniqueChar();

    final int indexOfFirstUniqueChar = firstUniqueChar.firstUniqChar("leetcode");

    System.out.println(indexOfFirstUniqueChar);

  }

}
