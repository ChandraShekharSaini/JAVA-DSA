
public class reverse {

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

    public Node reverse() {
        Node current = head;
        Node prev = null;
        Node next;
        while (current != null) {
            next = current.next;
            current.next = prev;   
            prev = current;
            current = next;

        }

        return prev;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
       System.out.println();
    }

    public void Display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {

        reverse sc = new reverse();
       
       sc.display();

        sc.AddLast(1);
        sc.AddLast(2);
        sc.AddLast(3);
        sc.AddLast(4);

        sc.display();

        Node nn = sc.reverse();

        sc.Display(nn);
    }
}
