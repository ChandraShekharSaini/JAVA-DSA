
public class LinkedListClient {

    public static void main(String[] args) {

        LinkedList sc = new LinkedList();

        sc.AddFirst(10);
        sc.AddFirst(20);
        sc.AddFirst(30);
        sc.AddFirst(40);

        sc.Display();

        System.out.println();

        System.out.println("Size:" + sc.size());

        sc.AddLast(100);
        sc.AddLast(200);
        sc.AddLast(300);

        sc.Display();

        sc.AddAtIndex(1, 12);

        System.out.println();
        sc.Display();

        System.out.println("Iteam at index 3:" + sc.get(7));

        System.out.println(sc.isEmpty());

        sc.Display();
        sc.removeFirst();
        sc.removeFirst();
        sc.removeFirst();
        sc.Display();

        sc.removeLast();

        sc.Display();
        System.out.println(sc.size());

        sc.removeAtIndex(2);
        sc.removeAtIndex(0);
        sc.Display();

        sc.removeAtIndex(0);

        sc.Display();

        sc.removeAtIndex(0);

        sc.Display();

      
    }
}
