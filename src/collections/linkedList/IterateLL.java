package collections.linkedList;

import java.util.Iterator;
import java.util.LinkedList;
// Write a Java program to iterate through all elements in a linked list.
public class IterateLL {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("red");
        linkedList.add("blue");
        linkedList.add("yellow");
        linkedList.add("green");

        Iterator iterator = linkedList.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
