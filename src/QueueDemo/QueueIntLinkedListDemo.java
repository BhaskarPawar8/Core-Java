package QueueDemo;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueIntLinkedListDemo {

    public static void main(String[] args) {

        Queue queue = new LinkedList();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        queue.add(60);

        System.out.println("First element of my queue: " + queue.peek()); // peek lets view the top of the queue

        queue.remove(); // removed one element

        System.out.println("Now print the first element of my queue: " + queue.peek()); // peek lets view the top of the queue

        System.out.println("Calling poll on queue: " +queue.poll()); // Retrieves and removes the head of this queue, or returns null if this queue is empty
        
        System.out.println("Now print the first element of my queue after poll: " + queue.peek()); // peek lets view the top of the queue

    }
}
