package com.training;

/**
 * {@link KToLast} has a methods to return k to last element of a Linked
 * list.
 * {@link KToLast#getKToLastIterative(LinkedListNode, int)} returns a
 * list with elements from k to last element of the argument list.
 * It uses two linked lists for the same.
 *
 * @author Nachiket Doke
 * @since 1.0
 */
public class KToLast {
    /**
     * Returns a k to last element of a linked list using another
     * list, in an iterative way
     *
     * @param node LinkedListNode from which k to last are to be
     * returned
     * @param k position from last from which node is to be returned
     * @return node with k to last elements
     */
    public LinkedListNode getKToLastIterative(LinkedListNode node, int k) {
        LinkedListNode tmp = node;
        for (int i = 0; i < k; i++) {
            tmp = tmp.next;
        }

        while (tmp != null) {
            node = node.next;
            tmp = tmp.next;
        }

        return node;
    }

    /**
     * Returns a k to last element of a linked list using another
     * list, in an recursive way when the length is known
     *
     * @param node LinkedListNode from which k to last are to be
     * returned
     * @param k position from last from which node is to be returned
     * @return node with k to last elements
     */
    public LinkedListNode getKToLastRecursive(LinkedListNode node, int k) {
        return getKToLastRecursiveHelper(node, k, node.findLength() - k);
    }

    private LinkedListNode getKToLastRecursiveHelper(LinkedListNode node, int k, int helper) {
        // base case
        if (k == 0 && node == null) {
            return null;
        }

        if (helper == 0) {
            return node;
        }

        return getKToLastRecursiveHelper(node.next, k, --helper);
    }
}
