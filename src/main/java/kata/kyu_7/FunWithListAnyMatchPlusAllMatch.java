package kata.kyu_7;

import java.util.function.Predicate;

public class FunWithListAnyMatchPlusAllMatch {

    public static void main(String[] args) {
        System.out.println(anyMatch(null, __ -> true));
        System.out.println(allMatch(new Node<Integer>(1, new Node<Integer>(2, new Node<Integer>(3, null))), x -> x > 1));
    }

    static <T> boolean anyMatch(Node<T> head, Predicate<T> p) {
        while (head != null) {
            if (p.test(head.data)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static <T> boolean allMatch(Node<T> head, Predicate<T> p) {
        return !anyMatch(head, p.negate());
    }

    static class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }
    }
}
