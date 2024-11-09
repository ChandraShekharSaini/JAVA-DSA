


public class Palindrome_LinkedList {

    
  public class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution {

        public boolean isPalindrome(ListNode head) {
            ListNode HEAD = reverse(head, null);

            while (HEAD.next != null && head.next != null)
            {
                HEAD = HEAD.next;
                head = head.next;

                if(HEAD.val != head.val) return false;
            }

            return true;
            
        }


        public ListNode reverse(ListNode curr, ListNode prev) {
            if (curr == null) {
                return prev;
            }

            ListNode temp = reverse(curr.next, curr);
            curr.next = prev;
            return temp;
        }

    }
}
