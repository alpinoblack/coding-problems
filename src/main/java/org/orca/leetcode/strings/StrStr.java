package org.orca.leetcode.strings;

public class StrStr {

  private boolean validateCandidate(final String hayStack, final String needle,
      final int hayStackOffset) {

    for (int i = 0; i < needle.length(); i++){
      if (hayStack.charAt(hayStackOffset + i) != needle.charAt(i)){
        return false;
      }
    }

    return true;

  }

  public int strStr(String haystack, String needle) {

    if (haystack.length() < needle.length()) {
      return -1;
    }

    if (needle.isEmpty()) {
      return 0;
    }

    for (int i = 0; i <= haystack.length() - needle.length(); i++) {

      if (haystack.charAt(i) == needle.charAt(0)){
        if (validateCandidate(haystack, needle, i)){
          return i;
        }
      }

    }

    return -1;


  }

  public static void main(final String[] args) {

    final StrStr strStr = new StrStr();

    final int firstOccurenctOfNeedle = strStr.strStr("aab", "b");

    System.out.println(firstOccurenctOfNeedle);

  }

}
