package com.datastructure.trees;

public class InorderTraversal {
	Node root;
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

	public static void inOrder(Node root) {
		if(root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data+" ");
		inOrder(root.right);
	}

	public static void preOrder(Node root) {
		if(root == null) {
			return;
		}
		System.out.print(root.data+" ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void postOrder(Node root) {
		if(root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data+" ");
	}
	public static void main(String[] args) {
		InorderTraversal tree = new InorderTraversal();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.right = new Node(30);
		tree.root.left.left = new Node(40);
		tree.root.left.right = new Node(50);
		inOrder(tree.root);
		System.out.println();
		preOrder(tree.root);
		System.out.println();
		postOrder(tree.root);
	}

}
