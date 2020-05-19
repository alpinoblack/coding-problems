package org.orca.leetcode.linked_lists;

public class DeleteNode {

  public void deleteNode(ListNode node) {

    if (node == null){
      return;
    }

    node.val = node.next.val;

    if (node.next.next == null){
      node.next = null;
    } else {
      deleteNode(node.next);
    }

  }

  public static void main(String[] args) {
    final DeleteNode deleteNode = new DeleteNode();

    final ListNode node1 = new ListNode(1);
    final ListNode node2 = new ListNode(2);
    final ListNode node3 = new ListNode(3);

    node1.next = node2;
    node2.next = node3;

    deleteNode.deleteNode(node2);

    ListNode.printList(node1);

  }

}



