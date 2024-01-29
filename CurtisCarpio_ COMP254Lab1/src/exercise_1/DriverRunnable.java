package exercise_1;

import exercise_1.DoublyLinkedList.Node;

public class DriverRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<String> listA = new DoublyLinkedList<String>();
		DoublyLinkedList<String> listB = new DoublyLinkedList<String>();
		listA.addFirst("(A)One");
		listA.addLast("(A)Two");
		listA.addLast("(A)Three");
		listA.addLast("(A)Four");

		listB.addFirst("(B)Five");
		listB.addLast("(B)Six");
		listB.addLast("(B)Seven");
		listB.addLast("(B)Eight");
		//

		System.out.println("Original list A: " + listA);
		System.out.println("Original list B: " + listB);

		DoublyLinkedList<String> result = ConcatenateLists(listA, listB);
		System.out.println("Result concat. : " + result);

		//
	}

	public static <E> DoublyLinkedList<E> ConcatenateLists(DoublyLinkedList<E> list1, DoublyLinkedList<E> list2) {
		DoublyLinkedList<E> lPrime = new DoublyLinkedList<E>();
		//instantiate a list to contain the elements of both lists
		
		Node<E> current = list1.first();
		//traverse list 1
		while (current.getNext() != null) {
			lPrime.addLast(current.getElement()); //add current element to new list
			current = current.getNext();
		}

		current = list2.first();
		//traverse list 2
		while (current.getNext() != null) {
			lPrime.addLast(current.getElement()); //add current element to new list
			current = current.getNext();
		}

		return lPrime;
	}
}