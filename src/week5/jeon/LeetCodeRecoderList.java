package AlgorithmBlue.Week5;
/*
Created on 2023/06/05 2:09 PM In Intelli J IDEA 
by jeon-wangi
*/

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LeetCodeRecoderList {
    public void reorderList(ListNode head) {
        int middle = maxLength(head, 0) / 2;
        Queue<Integer> s = new LinkedList<>();
        Queue<Integer> b = new LinkedList<>();

        append(head, s, b, 0, middle);
        Collections.reverse((List<?>) b);
        assign(head, s, b, 0);
    }

    private void append(ListNode head, Queue<Integer> s, Queue<Integer> b, int cnt, int middle) {
        if (head == null)
            return;

        if (cnt < middle)
            s.add(head.val);
        else
            b.add(head.val);

        append(head.next, s, b, cnt + 1, middle);
    }

    private void assign(ListNode head, Queue<Integer> s, Queue<Integer> b, int cnt) {
        if (head == null)
            return;

        if (cnt % 2 == 0) {
            Integer val = s.poll();
            head.val = (val != null) ? val : b.poll();
        } else {
            Integer val = b.poll();
            head.val = (val != null) ? val : s.poll();
        }

        assign(head.next, s, b, cnt + 1);
    }

    private int maxLength(ListNode head, int n) {
        if (head == null) {
            return n;
        }

        return maxLength(head.next, n + 1);
    }
}
