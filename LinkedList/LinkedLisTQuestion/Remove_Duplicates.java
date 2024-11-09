
import java.util.concurrent.ConcurrentHashMap;

public class Remove_Duplicates {

    public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        class Solution {

            public ListNode deleteDuplicates(ListNode head) {

                ListNode current = head;
                while (current != null) {
                    ListNode runner = current.next;
                    while (runner != null) {
                        if (runner.val == current.val) {
                            runner.next = runner.next.next;
                        } else {
                            runner = runner.next;
                        }
                    }
                    current = current.next;
                }

                return current;
            }
        }

    }
}
