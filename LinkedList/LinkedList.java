
public class LinkedList {

    class Node {

        Node next;
        int data;
    }

    private Node head;
    private Node tail;
    private int size;

    public void AddFirst(int iteam) {
        Node nn = new Node();
        nn.data = iteam;
        if (size == 0) {
            head = tail = nn;
        } else {
            nn.next = head;
            head = nn;

        }

        size++;
    }

    public void AddLast(int iteam) {
        if (size == 0) {
            AddFirst(iteam);
        } else {
            Node nn = new Node();
            nn.data = iteam;
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    public void AddAtIndex(int k, int iteam) {
        if (k == 0) {
            AddFirst(iteam);
        }
        if (k == size - 1) {
            AddLast(iteam);
        }
        Node nn = new Node();
        nn.data = iteam;
        Node k_1th = GetNode(k - 1);
        nn.next = k_1th.next;
        k_1th.next = nn;
        size++;

    }

    public int removeFirst() {
        int rv = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            Node temp = head.next;
            head.next = null;
            head = temp;
        }

        size--;
        return rv;
    }

    public int removeLast() {
        int rv = tail.data;
        if (size == 1) {
            removeFirst();
        } else {
            Node sl = GetNode(size - 2);
            sl.next = null;
            tail = sl;
            size--;

        }
        return rv;
    }

    public int removeAtIndex(int k) {
        if (k == 0) {
            return removeFirst();
        } else if (k == size - 1) {
            return removeLast();
        } else {
            Node k_th = GetNode(k - 1);
            Node K_th2 = k_th.next;

            k_th.next = K_th2.next;
            K_th2.next = null;
            size--;
            return K_th2.data;
        }

    }

    public Node reverse() {
        Node current = head;
        Node prev = null;
        Node next ;
        while (current != null) {
            next = current.next;
            current.next = next;
            prev = current;
            current = next;

        }

        return prev;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
     
    }

    public int get(int k) {
        Node val = GetNode(k);
        return val.data;
    }

    public int peek() {
        return head.data;
    }

    public int getLast() {
        return tail.data;
    }

    public int getFirst(int k) {
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Node GetNode(int k) {

        Node temp = head;
        for (int i = 0; i < k; i++) {
            temp = temp.next;
        }
        return temp;
    }
}
