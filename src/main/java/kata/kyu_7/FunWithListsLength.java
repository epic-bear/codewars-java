package kata.kyu_7;

public class FunWithListsLength {

    public static void main(String[] args) {
        System.out.println(length(new Node<>(1, new Node(2,null))));
    }
    static int length(Node head) {
        if(head == null) return 0;
        return length(head.next) + 1;
    }

    static class Node<T> {

        public T data;
        public Node next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
