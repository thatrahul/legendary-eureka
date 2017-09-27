package com.rahul.demo.tree;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by xbbl129 on 9/26/17.
 */
public class PrintBinaryTree {


    public String printBinary(BinaryNode head) {
        StringBuilder builder = new StringBuilder();
        Queue<BinaryNode> queue = new ArrayDeque<>();
        queue.offer(head);
        while(!queue.isEmpty()) {
            BinaryNode current = queue.poll();
            builder.append(current.value);
            builder.append("->");
            BinaryNode left = current.getLeft();
            BinaryNode right = current.getRight();
            if (left != null) {
                queue.offer(left);
            }
            if (right != null) {
                queue.offer(right);
            }
        }
        return builder.toString();
    }
}
