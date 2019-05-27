package com.datastructure.trees;

public class TreeDS {
	Node root;
	public TreeDS() {
		this.root = null;
	}
	
	public TreeDS(int data) {
		this.root = new Node(data);
	}
	
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
		TreeDS tree = new TreeDS();
		tree.root = new Node(10);
		tree.root.left = new Node(20);
		tree.root.left = new Node(30);
	}

}
