package org.orca.leetcode.linked_lists;

import java.util.ArrayList;
import java.util.List;

public class ListNode {

  int val;
  ListNode next;

  public ListNode(int x) {
    val = x;
    next = null;
  }

  public static void printList(final ListNode root){

    final List<String> nodesValues = new ArrayList<>();

    ListNode currentNode = root;

    while(currentNode != null){

      nodesValues.add(Integer.toString(currentNode.val));

      currentNode = currentNode.next;

    }

    System.out.println(String.join(",", nodesValues));

  }

}
