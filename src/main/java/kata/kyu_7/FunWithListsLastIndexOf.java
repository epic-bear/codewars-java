package kata.kyu_7;

public class FunWithListsLastIndexOf {

    public static void main(String[] args) {
        System.out.println();
    }

    static int lastIndexOf(Node head, Object value) {
        int index = -1;
        int currentIndex = 0;

        Node current = head;

        while (current != null) {
            if (current.data.equals(value)) {
              index = currentIndex;
            }
            current = current.next;
            ++currentIndex;
        }
        return index;
    }

    static class Node<T> {
        public Object data;
        public Node<T> next;

        Node(T data, Node<T> next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
