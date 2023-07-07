package kata.kyu_7;

public class FunWithListsIndexOf {

  public static void main(String[] args) {
    System.out.println();
  }

  static int indexOf(Node head, Object value) {
    int counter = -1;
    Node current = head;

    while (current != null) {
      counter++;
      if (current.data.equals(value)) {
        return counter;
      } else {
        current = current.next;
      }
    }
    return -1;
  }

  class Node {

    public Object data;
    public Node next;

    Node(Object data, Node next) {
      this.data = data;
      this.next = next;
    }

    Node(Object data) {
      this(data, null);
    }
  }
}
