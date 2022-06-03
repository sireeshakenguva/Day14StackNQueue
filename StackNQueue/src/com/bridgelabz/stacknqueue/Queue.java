package com.bridgelabz.stacknqueue;

public class Queue {
        Node front, rear;

        public void enqueue(int x) {        // Enqueue in Queue
            Node newNode = new Node(x);
            if (isEmpty()) {
                rear = newNode;
                front = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        public boolean isEmpty() {

            return rear == null;
        }

        public void display() {
            if (isEmpty()) {
                System.out.print("\n Queue is empty. Add data in Queue");
            } else {
                Node temp = front;
                while (temp != null) {
                    System.out.print(temp.data + " ");
                    temp = temp.next;
                }
            }
        }
        public void dequeue() {
            if (isEmpty()) {
                System.out.println("QUEUE is Empty.Please add Data to delete ");
            } else
                front = front.next;

        }
    }
