package exercise_3;

public class DriverRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularlyLinkedList<String> list = new CircularlyLinkedList<String>();
		list.addFirst("orange");
		list.addLast("grape");
		list.addLast("pear");
		list.addLast("kiwi");
		list.addLast("pineapple");
		list.addLast("mango");
		System.out.println("Original list:  " + list);
		list.rotate();
		System.out.println("After rotation: " + list);

		CircularlyLinkedList<String> clonedList = list.clone();
		System.out.println("Cloned list:    " + clonedList);
		list.rotate();
		System.out.println("After rotation: " + list);

		clonedList = list.clone();
		System.out.println("Cloned list:    " + clonedList);
	}

}
