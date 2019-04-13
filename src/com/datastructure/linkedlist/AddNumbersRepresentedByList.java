package com.datastructure.linkedlist;

public class AddNumbersRepresentedByList {

	Node head;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void push(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;

	}

	private static void print(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		AddNumbersRepresentedByList list1 = new AddNumbersRepresentedByList();
		list1.push(4);
		list1.push(3);
		list1.push(2);
		list1.push(1);

		AddNumbersRepresentedByList list2 = new AddNumbersRepresentedByList();
		list2.push(4);
		list2.push(3);
		list2.push(2);
		list2.push(9);
		
		Node merged = reverse(addTwoNumbersRepresentedByList(list1.head, list2.head));
		print(merged);
	}

	private static Node addTwoNumbersRepresentedByList(Node number1, Node number2) {
		Node n1 = reverse(number1);
		Node n2 = reverse(number2);
		int carry = 0;
		Node dummy = new Node(0);
		Node result = dummy;;
		
		while(n1 != null || n2 != null) {
			int sum = carry;
			if(n1 != null) {
				sum += n1.data;
				n1 = n1.next;
			}
			if(n2 != null) {
				sum += n2.data;
				n2 = n2.next;
			}
			if(sum > 9) {
				sum = sum - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			Node n = new Node(sum);
			result.next = n;
			result = result.next;
		}
		
		if(carry > 0) {
			Node n = new Node(carry);
			result.next = n;
		}
		return dummy.next;
	}

	private static Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}

		return prev;
	}

}
