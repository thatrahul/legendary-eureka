package com.rahul.demo.tree;

/**
 * Created by xbbl129 on 5/18/17.
 */
public class BinaryNode {

    int value;

    BinaryNode left;
    BinaryNode right;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }
}
