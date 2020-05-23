package org.orca.leetcode.others;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidParentheses {

  public boolean isValid(String s) {

    final Map<Character, Character> parenthesesMap = new HashMap<>();
    parenthesesMap.put(']', '[');
    parenthesesMap.put(')', '(');
    parenthesesMap.put('}', '{');

    final Set<Character> openingParentheses = new HashSet<>(parenthesesMap.values());

    final Deque<Character> parenthesesStack = new ArrayDeque<>();

    for (int i = 0; i < s.length(); i++){

      final char currentChar = s.charAt(i);

      if (openingParentheses.contains(currentChar)){
        parenthesesStack.push(currentChar);
      } else {
        final Character matchingOpeningParentheses = parenthesesMap.get(currentChar);
        if (matchingOpeningParentheses != null){
          if (matchingOpeningParentheses.equals(parenthesesStack.peek())){
            parenthesesStack.pop();
          } else {
            return false;
          }

        }
      }

    }

    if (parenthesesStack.isEmpty()){
      return true;
    } else {
      return false;
    }

  }

  public static void main(final String[] args) {

    final ValidParentheses validParentheses = new ValidParentheses();

    System.out.println(validParentheses.isValid("[{]}"));

  }

}
