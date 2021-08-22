
public class Driver {
	static int[] newArray = { 1, 7, 3, 4, 9, 2 }; // Sets an integer array

	public static void main(String[] args) {
		ArrayStack array = new ArrayStack();  // Create ArrayStack class object
		for (int index = 0; index < newArray.length; index++) {
			array.push(newArray[index]);  		// Add values to the ArrayStack
		}

		// Remove and print ArrayStack values (Last in, is first out so: 2, 9, ..... 1)
		while (!(array.isEmpty())) {
			System.out.println(array.pop());
		}
		System.out.println();
		System.out.println();	
		LinkedStack stack = new LinkedStack(); // Create LinkedStack class object
		for (int index = 0; index < newArray.length; index++) {
			stack.push(newArray[index]);  // Add values to the LinkedStack
		}
		for (int index = 0; index < newArray.length; index++) {  // Remove and print LinkedStack values
		System.out.println(stack.pop());
		}
	}
}
