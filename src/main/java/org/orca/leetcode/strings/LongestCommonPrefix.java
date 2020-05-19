package org.orca.leetcode.strings;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {

  public String longestCommonPrefix(String[] strs) {

    if (strs.length == 1) {
      return strs[0];
    }

    if (strs.length == 0) {
      return "";
    }

    final StringBuilder stringBuilder = new StringBuilder();

    int currentLetterIndex = 0;

    while (true) {

      final List<Character> characters = new ArrayList<>();

      for (int i = 0; i < strs.length; i++) {

        if (strs[i].length() > currentLetterIndex) {
          characters.add(strs[i].charAt(currentLetterIndex));
        } else {
          return stringBuilder.toString();
        }

      }

      if (characters.stream().allMatch(letter -> characters.get(0).equals(letter)) && !characters.isEmpty()) {
        stringBuilder.append(characters.get(0));
      } else {
        break;
      }

      currentLetterIndex++;
    }

    return stringBuilder.toString();

  }

  public static void main(final String[] args) {

    final LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

    final String commonPrefix = longestCommonPrefix
        .longestCommonPrefix(new String[]{"","b"});

    System.out.println(commonPrefix);

  }

}
