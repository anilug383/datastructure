package com.datastructure.trees;

public class HeightOfABinaryTree {
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
	
	public static void main(String[] args) {
		HeightOfABinaryTree tree = new HeightOfABinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		levelOrderTraversal(tree.root);
		System.out.println();
		levelOrderTraversalReverse(tree.root);
	}

	private static void levelOrderTraversal(Node root) {
		int height = height(root);
		for (int i = 0; i <= height; i++) {
			printGivenOrder(root, i);
		}
	}
	
	private static void levelOrderTraversalReverse(Node root) {
		int height = height(root);
		for (int i = height; i <= height; i--) {
			printGivenOrder(root, i);
		}
	}

	private static void printGivenOrder(Node root, int level) {
		if(root == null) {
			return;
		}
		if(level == 0) {
			System.out.print(root.data+" ");
		} else if (level > 0) {
			printGivenOrder(root.left, level-1);
			printGivenOrder(root.right, level-1);
		}
		
	}

	private static int height(Node root) {
		if(root == null) {
			return -1;
		} else{
			int lDepth = height(root.left);
			int rDepth = height(root.right);
			
			return Math.max(lDepth, rDepth)+1;
		}
	}

}
