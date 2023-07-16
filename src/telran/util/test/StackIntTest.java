package telran.util.test;

import java.util.NoSuchElementException;

//import java.util.ArrayList;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
import telran.interviews.*;

public class StackIntTest {
    public static void main(String[] args) {
        StackInt stack = new StackInt();

        // Test isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected output: true

        // Test pop() on an empty stack
        try {
            stack.pop();
        } catch (NoSuchElementException e) {
            System.out.println("Expected exception: " + e.getMessage()); // Expected output: Stack is empty
        }

        // Test push() and pop()
        stack.push(5);
        stack.push(10);
        stack.push(3);

        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected output: false
        System.out.println("Top element: " + stack.pop()); // Expected output: 3
        System.out.println("Top element: " + stack.pop()); // Expected output: 10
        System.out.println("Top element: " + stack.pop()); // Expected output: 5

        System.out.println("Is stack empty? " + stack.isEmpty()); // Expected output: true

        // Test max()
        stack.push(2);
        stack.push(8);
        stack.push(6);

        System.out.println("Maximum value: " + stack.max()); // Expected output: 8
        stack.pop();
        System.out.println("Maximum value: " + stack.max()); // Expected output: 8
        stack.pop();
        System.out.println("Maximum value: " + stack.max()); // Expected output: 2
    }
}
