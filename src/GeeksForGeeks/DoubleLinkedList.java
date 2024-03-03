package GeeksForGeeks;

class Node
{
    int data;
    Node next;
    Node prev;
    Node(int d)
    {
        data = d;
        next = prev = null;
    }
}
class DoubleLinkedList {

    Node deleteNode(Node head,int x)
    {
        if (head == null)
            return null;

        if (x == 1)
        {
            head = head.next;
            head.prev = null;
            return head;
        }

        Node current = head;
        int count = 1;

        while (count < x && current != null)
        {
            current = current.next;
            count++;
        }

        if (current == null)
            return head;

        if (current.next == null)
        {
            current.prev.next = null;
            return head;
        }

        current.prev.next = current.next;
        current.next.prev = current.prev;

        return head;
    }


    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        Node head = new Node(2);
    }
}
