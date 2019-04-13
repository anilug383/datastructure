package com.datastructure.linkedlist;

public class MergeTwoSortedList {
	
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

	private static void print(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		MergeTwoSortedList list1 = new MergeTwoSortedList();
		list1.push(40);
		list1.push(30);
		list1.push(20);
		list1.push(10);
		list1.push(00);
		
		MergeTwoSortedList list2 = new MergeTwoSortedList();
		list2.push(45);
		list2.push(35);
		list2.push(25);
		list2.push(15);
		list2.push(05);
		
		Node merged = mergeTwoSortedNodes(list1.head, list2.head);
		print(merged);
		
	}

	private static Node mergeTwoSortedNodes(Node list1, Node list2) {
		Node head = new Node(0);
		Node p = head;
		while(list1 != null || list2 != null) {
			if(list1 != null && list2 != null) { 
				if(list1.data < list2.data) {
					p.next = list1;
					list1 =list1.next;
				} else {
					p.next = list2;
					list2 = list2.next;
				}
				p = p.next;
			}
			if(list1 == null) {
				p.next = list2;
				break;
			}
			if(list2 == null) {
				p.next = list1;
				break;
			}
		}
		return head.next;
	}

}
