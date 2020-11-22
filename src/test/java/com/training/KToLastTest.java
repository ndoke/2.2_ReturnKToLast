package com.training;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KToLastTest {
    private KToLast kToLast = new KToLast();
    private LinkedListNode node;

    @BeforeMethod
    public void setUp() {
        node = new LinkedListNode(10);
        initializeNode(node);
    }

    private void initializeNode(LinkedListNode node) {
        LinkedListNode prev = node;
        for (int i = 9; i >= 1; i--) {
            LinkedListNode curr = new LinkedListNode(i);
            prev.next = curr;
            prev = prev.next;
        }
    }

    @Test
    public void getKToLastIterative() {
        LinkedListNode kTl = kToLast.getKToLastIterative(node, 3);
        Assert.assertEquals(kTl.findLength(), 3);
    }

    @Test
    public void getKToLastRecursive() {
        LinkedListNode kTl = kToLast.getKToLastRecursive(node, 3);
        Assert.assertEquals(kTl.findLength(), 3);
    }
}
