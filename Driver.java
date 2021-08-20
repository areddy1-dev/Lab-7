
public class Driver {

	// Sets an integer array

	static int[] newArray = { 1, 7, 3, 4, 9, 2 };

	public static void main(String[] args) {

		// Create ArrayStack class object
		ArrayStack array = new ArrayStack();

		// Add values to the ArrayStack
		for (int index = 0; index < newArray.length; index++) {
			array.push(newArray[index]);
		}

		// Remove and print ArrayStack values (Last in, is first out so: 2, 9, ..... 1)
		while (!(array.isEmpty())) {
			System.out.println(array.pop());
		}

		System.out.println();
		System.out.println();
		
		
		// Create LinkedStack class object
		LinkedStack stack = new LinkedStack();

		// Add values to the LinkedStack
		for (int index = 0; index < newArray.length; index++) {
			stack.push(newArray[index]);
		}

		// Remove and print LinkedStack values
		for (int index = 0; index < newArray.length; index++) {
		System.out.println(stack.pop());
		}
	}
}
