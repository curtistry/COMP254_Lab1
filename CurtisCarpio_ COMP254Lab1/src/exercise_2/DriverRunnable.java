package exercise_2;


public class DriverRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.addFirst("apple");
		list.addLast("banana");
		list.addLast("carrot");
		list.addLast("dog");
		list.addLast("elephant");
		list.addLast("frog");

		System.out.println("Original list:      " + list);
		list.swapNodes("banana", "elephant");

		System.out.println("After first swap:   " + list);
		list.swapNodes("carrot", "dog");
		
		list.removeFirst();
		System.out.println("Removing element:   " + list);
		
		list.swapNodes("banana", "dog");

		System.out.println("Swap after removal: " + list);

		list.swapNodes("banana", "banana");

	}
}
