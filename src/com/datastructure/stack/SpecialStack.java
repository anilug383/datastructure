package com.datastructure.stack;

import java.util.Stack;

public class SpecialStack extends Stack<Integer>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9051237171327886791L;
	
	Stack<Integer> minStack = new Stack<>();
	
	public void push(int data) {
		if(isEmpty()) {
			super.push(data);
			minStack.push(data);
		} else {
			super.push(data);
			int x = minStack.peek();
			if(data < x) {
				minStack.push(data);
			} else {
				minStack.push(x);
			}
		}
		
	}
	public Integer pop() {
		minStack.pop();
		return super.pop();
	}
	
	public Integer getMin() {
		return minStack.peek();
	}
	
	public static void main(String[] args) {
		
		SpecialStack stack = new SpecialStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(15);
		stack.push(12);
		stack.push(01);
		
		System.out.println(stack.getMin());
		
	}

}
