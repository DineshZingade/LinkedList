package com.bridgelabz.linkedlist.UC5;

public class MainClass {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		// System.out.println("----------------UC1----------------");
		// list.add(56);
		// list.add(30);
		// list.add(70);
		// list.printList();

		// System.out.println("----------------UC2----------------");
		// list.push(70);
		// list.push(30);
		// list.push(56);
		// list.printList();

		System.out.println("----------------UC4----------------");
		// list.add(56);
		// list.add(70);
		// list.insertAfter(list.head,30);
		// list.printList();

		System.out.println("----------------UC5----------------");
		list.add(56);
		list.add(30);
		list.add(70);
		list.pop();
		list.printList();

	}

}