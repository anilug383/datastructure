package com.datastructure.stack;

public class StackUsingArray {

	int[] array;
	int size;
	int top1, top2;

	public StackUsingArray(int size) {
		// TODO Auto-generated constructor stub
		array = new int[size];
		top1 = -1;
		top2 = size;
		this.size = size;
	}

	public void push1(int data) {
		if(top1 < top2-1) {
			top1++;
			array[top1] = data;
		} else {
			System.out.println("Full");
			System.exit(0);
		}

	}

	public void push2(int data) {
		if(top1 < top2-1) {
			top2--;
			array[top2] = data;
		} else {
			System.out.println("Full");
			System.exit(0);
		}
	}

	public int pop1() {
		if(top1 >= 0) {
			return array[top1--];
		} else {
			System.out.println("Empty");
			System.exit(0);
		}
		return 0;
	}

	public int pop2() {
		if(top2 <= size) {
			return array[top2++];
		} else {
			System.out.println("Empty");
			System.exit(0);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		StackUsingArray stack = new StackUsingArray(4);
		stack.push1(10);
		stack.push1(20);
		stack.push2(30);
		stack.push2(40);
		
		System.out.println(stack.pop1());
		System.out.println(stack.pop2());
		
	}

}
