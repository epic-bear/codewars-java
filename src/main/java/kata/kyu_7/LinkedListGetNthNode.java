package kata.kyu_7;


public class LinkedListGetNthNode {

  public static void main(String[] args) {
    System.out.println();
  }

  static class Node {

    public int data;
    public Node next = null;

    public static int getNth(Node n, int index) throws Exception {
      if (n == null) {
        throw new Exception("exception");
      }

      return index == 0 ? n.data : getNth(n.next, index - 1);
    }
  }
}
