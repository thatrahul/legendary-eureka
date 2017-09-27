package com.rahul.demo;

/**
 * Created by xbbl129 on 9/21/17.
 */
public class ReverseLinkedList<T> {



    public Node<T> reverse (Node<T> head) {
        Node<T> previous = null;
        Node<T> current = head;
        Node<T> next = current.next;

        while (current != null) {
            Node<T> tempNext = next != null ? next.next : null;
            current.next = previous;
            if (next != null) {
                next.next = current;
            }
            previous = current;
            current = next;
            next = tempNext;
        }
        return previous;
    }


    public String printList(Node<T> head) {
        StringBuilder builder = new StringBuilder();
        Node<T> current = head;

        while (current != null) {
            builder.append(current.value.toString());
            builder.append("->");
            current = current.next;
        }
        builder.append("null");

        return builder.toString();
    }



    public static class Node<T> {
        private T value;

        public Node(T value) {
            this.value = value;
        }

        private Node<T> next;

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public Node<T> getNext() {
            return next;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }
    }
}
