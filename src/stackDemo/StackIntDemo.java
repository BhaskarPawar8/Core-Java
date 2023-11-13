package stackDemo;

import java.util.Stack;

public class StackIntDemo {

    public static void main(String[] args) {

        Stack myStack = new Stack<Integer>();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);

        System.out.println("First element of my stack: " + myStack.peek()); // peek lets view the top of the stack

        myStack.pop(); // removed one element

        System.out.println("First print the last element of my stack: " + myStack.peek()); // peek lets view the top of the stack

        int resultStack = myStack.search(10); // Returns the 1-based position from the top of the stack where the object is located; the return value -1 indicates that the object is not on the stack.
        System.out.println(resultStack);

    }
}
