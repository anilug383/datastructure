package com.datastructure.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromUnsorted {
	
	Node head;
	static class Node {
		int data;
		Node next;

		Node (int data){
			this.data = data;
			this.next = null;
		}
	}

	private void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	private void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		RemoveDuplicatesFromUnsorted list = new RemoveDuplicatesFromUnsorted();
		list.push(40);
		list.push(00);
		list.push(10);
		list.push(30);
		list.push(20);
		list.push(10);
		list.push(20);
		list.push(00);
		list.print(list.head);
		Node node = removeDups(list.head);
		list.print(node);
	}

	private static Node removeDups(Node head) {
		Node current = head;
		Node prev = null;
		Set<Integer> set = new HashSet<>();
		while (current != null) {
			int currVal = current.data;
			if(set.contains(currVal)) {
				prev.next = current.next;
			} else {
				set.add(currVal);
				prev = current;
			}
			current = current.next;
		}
		return head;
	}

}
