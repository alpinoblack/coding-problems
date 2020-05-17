package org.orca.leetcode.strings;

public class ReverseString {

  public void reverseString(char[] s) {

    if (s != null && s.length > 1) {
      final int partitionIndex = s.length / 2;

      for (int i = 0; i < partitionIndex; i++) {

        final char left = s[i];
        final char right = s[s.length -1 - i];

        s[i] = right;
        s[s.length -1 - i] = left;
      }
    }

  }


  public static void main(final String[] args) {

    final ReverseString reverseString = new ReverseString();

    final char[] chars = {'a', 'b', 'b'};

    reverseString.reverseString(chars);

    System.out.println(chars);

  }

}
