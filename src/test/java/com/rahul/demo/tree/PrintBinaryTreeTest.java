package com.rahul.demo.tree;

import org.junit.Test;

/**
 * Created by xbbl129 on 9/26/17.
 */
public class PrintBinaryTreeTest {
    @Test
    public void printBinary() throws Exception {

        BinaryNode root = build(10);
        BinaryNode seven = build(7);
        BinaryNode twenty = build(20);
        root.setLeft(seven);
        root.setRight(twenty);

        PrintBinaryTree printer = new PrintBinaryTree();
        String value = printer.printBinary(root);
        //assertEquals("Non matching", "test", value);

    }






    public static BinaryNode build(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        return node;
    }


}