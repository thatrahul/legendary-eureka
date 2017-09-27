package com.rahul.demo;

import org.junit.Test;

import static com.rahul.demo.ReverseLinkedList.Node;

/**
 * Created by xbbl129 on 9/21/17.
 */
public class ReverseLinkedListTest {
    @Test
    public void reverse() throws Exception {
        ReverseLinkedList<String> reverser = new ReverseLinkedList<>();

        String[] vals = {"1", "2", "3", "4", "5"};
        Node<String> head = build(vals);
        System.out.println(reverser.printList(head));
        Node<String> reversed = reverser.reverse(head);
        System.out.println(reverser.printList(reversed));

    }


    public Node<String> build(String[] values) {
        Node<String> head =null;
        Node<String> previous = null;

        for (int i = 0; i < values.length; i++) {
            Node<String> current = new Node<String>(values[i]);
            if (previous != null) {
                previous.setNext(current);
            } else {
                head = current;
            }
            previous = current;
        }
        return head;
    }
}