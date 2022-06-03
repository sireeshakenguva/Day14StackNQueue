package com.bridgelabz.stacknqueue;

public class Stack {
    Node top;

    public void push(int x) {
        Node newNode = new Node(x);
        if (isEmpty()) {
            top = newNode;
        } else {
            newNode.data = x;
            newNode.next = top;
            top = newNode;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (top == null) {
            System.out.printf("\nStack is Empty and Underflow");
        } else {
            Node temp = top;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.print("\n Stack is EMPTY and Underflow");
            return;
        }
        for (int i = 0; i < 3; i++) {
            top = top.next;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            System.out.println("Top data is :" + top.data);
            return top.data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}