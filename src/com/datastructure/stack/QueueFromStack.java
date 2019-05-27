package com.datastructure.stack;

import java.util.Stack;

public class QueueFromStack {
	
	static class Queue {
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}
	
	static void push(Stack<Integer> top_reference, int data) {
		top_reference.push(data);
	}
	static int pop(Stack<Integer> top_reference) {
		if(top_reference.isEmpty()) {
			System.out.println("Error");
			System.exit(0);
		}
		return top_reference.pop();
	}
	static void enQueue(Queue queue, int data) {
		push(queue.stack1, data);
	}
	static int deQueue(Queue queue) {
		int x;
		if(queue.stack1.isEmpty() && queue.stack2.isEmpty()) {
			System.out.println("Queue is empty");
			System.exit(0);
		}
		
		if(queue.stack2.isEmpty()) {
			while(!queue.stack1.isEmpty()) {
				x = pop(queue.stack1);
				push(queue.stack2, x);
			}
		}
		
		x = pop(queue.stack2);
		return x;	
	}
	
	public static void main(String[] args) {
		Queue queue = new Queue();
		queue.stack1 = new Stack<>();
		queue.stack2 = new Stack<>();
		
		enQueue(queue, 10);
		enQueue(queue, 20);
		enQueue(queue, 30);
		
		System.out.println(deQueue(queue));
		System.out.println(deQueue(queue));
		System.out.println(deQueue(queue));
		System.out.println(deQueue(queue));
	}

}
