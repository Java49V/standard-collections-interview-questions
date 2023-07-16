package telran.interviews;

//import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class StackInt {
    private Node top;
    private int max;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int num) {
        Node newNode = new Node(num);
        newNode.next = top;
        top = newNode;

        if (isEmpty() || num > max) {
            max = num;
        }
    }

    public int pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        int data = top.data;
        top = top.next;

        if (data == max) {
            findNewMax();
        }

        return data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        return max;
    }

    private void findNewMax() {
        if (isEmpty()) {
            max = 0;
        } else {
            Node current = top;
            max = current.data;

            while (current != null) {
                if (current.data > max) {
                    max = current.data;
                }
                current = current.next;
            }
        }
    }
}

