package com.datastructure.trees;

public class SpiralLevelOrderTraversal {
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
		SpiralLevelOrderTraversal tree = new SpiralLevelOrderTraversal();
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
		int height = height(root);
		boolean flag = false;
		for (int i = 0; i <=height; i++) {
			print(root, i, flag);
			flag = !flag;
		}
		
	}
	private static void print(Node root, int level, boolean flag) {
		if(root == null) {
			return;
		}
		if(level == 0) {
			System.out.print(root.data+" ");
		} else if(level > 0) {
			if(flag) {
				print(root.left, level-1, flag);
				print(root.right, level-1, flag);
			} else {
				print(root.right, level-1, flag);
				print(root.left, level-1, flag);
			}
		}
		
	}
	private static int height(Node root) {
		if(root == null) {
			return -1;
		} else {
			int lh = height(root.left);
			int rh = height(root.left);
			
			return Math.max(lh, rh)+1;
		}
	}

}
