package com.datastructure.trees;

import java.util.Stack;

public class SpiralTraversalUsingStack {
	Node root;
	static Stack<Node> stack1 = new Stack<>();
	static Stack<Node> stack2 = new Stack<>();

	static class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	public static void main(String[] args) {
		SpiralTraversalUsingStack tree = new SpiralTraversalUsingStack();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(6);
		tree.root.right.left = new Node(5);
		tree.root.right.right = new Node(4);

		printSpiralLevelOrder(tree.root);
	}
	private static void printSpiralLevelOrder(Node root) {
		if (root == null) {
			return;
		}
		stack1.push(root);
		while(!stack1.isEmpty() || !stack2.isEmpty()) {
			while(!stack1.isEmpty()) {
				Node temp = stack1.pop();
				System.out.print(temp.data+" ");
				if(temp.right != null) {
					stack2.push(root.right);
				}
				if(temp.left != null) {
					stack2.push(root.left);
				}
			}
			while(!stack2.isEmpty()) {
				Node temp = stack2.pop();
				System.out.print(temp.data+" ");
				if(temp.left != null) {
					stack1.push(temp.left);
				}
				if(temp.right != null) {
					stack1.push(temp.right);
				}
			}
		}

	}

}
