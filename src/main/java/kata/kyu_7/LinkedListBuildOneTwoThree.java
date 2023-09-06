package kata.kyu_7;

public class LinkedListBuildOneTwoThree {

  static class Node {

    int data;
    Node next = null;

    Node(final int data) {
      this.data = data;
    }

    public static Node push(final Node head, final int data) {
      Node node = new Node(data);
      node.next = head;
      return node;
    }

    public static Node buildOneTwoThree() {
      Node chained = null;
      chained = push(chained, 3);
      chained = push(chained, 2);
      chained = push(chained, 1);
      return chained;
    }
  }
}
