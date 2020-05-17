package org.orca.leetcode.strings;

public class ValidAnagram {

  public boolean isAnagram(String s, String t) {

    if (s.length() == t.length()) {

      final int[] sHistogram = new int[26];
      final int[] tHistogram = new int[26];

      for (int i = 0; i < s.length(); i++){
        sHistogram[s.charAt(i) - 97]++;
        tHistogram[t.charAt(i) - 97]++;
      }

      for (int i = 0; i < sHistogram.length; i++){
        if (sHistogram[i] != tHistogram[i]) {
          return false;
        }
      }

      return true;

    } else {
      return false;
    }

  }

  public static void main(final String[] args) {

    final ValidAnagram validAnagram = new ValidAnagram();

    System.out.println(validAnagram.isAnagram("ana", "nna"));

  }

}
