package com.datastructure.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class LoopInALinkedList {
	
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
	
	private static boolean detectLoopUsingHash(Node head) {
		Set<Node> set = new HashSet<>();
		while(head != null) {
			if(set.contains(head)) {
				return true;
			}
			set.add(head);
			head = head.next;
		}
		return false;
	}
	
	private static boolean detectLoopUsingFloydsAlgo(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return true;
			}
		}
		return false;
	}
	
	private static int findLengthOfTheLoop(Node head) {
		Node slowPtr = head;
		Node fastPtr = head;
		
		while(slowPtr != null && fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
			if (slowPtr == fastPtr) {
				return findLength(slowPtr);
			}
		}
		return 0;
	}
	
	public static int findLength(Node head) {
		Node temp = head;
		int count = 1;
		while(temp.next != head) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		LoopInALinkedList list = new LoopInALinkedList();
		list.push(10);
		list.push(20);
		list.push(30);
		list.push(40);
		
		list.print(list.head);
		
		//looping the list
		list.head.next.next.next.next = list.head.next;
		
		//finding the loop using hash
		if(detectLoopUsingHash(list.head)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		
		//finding the loop using floyd's algo
		if(detectLoopUsingFloydsAlgo(list.head)) {
			System.out.println("Found");
		} else {
			System.out.println("Not found");
		}
		
		System.out.println("Length of the loop : "+findLengthOfTheLoop(list.head));
	}

}
