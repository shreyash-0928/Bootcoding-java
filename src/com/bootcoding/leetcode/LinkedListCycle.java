package com.bootcoding.leetcode;

import com.bootcoding.leetcode.ListNode;

public class LinkedListCycle {
    public boolean hasCycle(ListNode head) {

        ListNode sp = head;
        ListNode fp = head;
        while (fp != null && fp.next != null) {
            sp = sp.next;
            fp = fp.next.next;
            if (sp == fp) {
                return true;
            }
        }
        return false;

    }
}
