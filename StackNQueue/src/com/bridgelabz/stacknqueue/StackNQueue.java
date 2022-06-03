package com.bridgelabz.stacknqueue;

public class StackNQueue {
    public static void main(String[] args) {
        System.out.println("Welcome Stack and Queue program");
        Stack list = new Stack();
        list.push(70);
        list.push(30);
        list.push(56);
        list.peek();
        System.out.println("The Stack elements are ");
        list.display();
        list.pop();
        System.out.println("\nafter deletion ");
        list.display();
        System.out.printf("\nTop element is %d\n", list.peek());
    }
}