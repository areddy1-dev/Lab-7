
 
		public class  LinkedStack {  //Code (except taken from "Additional Examples"
			                         // This class implements a Stack ADT as a linked list
			
			LinkedNode front; // Reference to the first LinkedNode in the list
			int count; // Number of nodes in the list

			LinkedStack() {  // Constructor - initializes the front and count variables
				front = null;
				count = 0;
			}
			void push(int x) {   // Implements the push operation
				LinkedNode newNode = new LinkedNode(x);
				newNode.next = front;
				front = newNode;
				count++;
			}
			int pop() {  // Implements the pop operation
				int x = front.x;
				front = front.next;
				count--;
				return x;
			}

			int peek() {  // Implements the peek operation
				return front.x;
			}

			boolean isEmpty() { // Implements the isEmpty operation
				return front == null;
			}

			int size() {  // Implements the size operation
				return count;
			}

			// This method returns a String containing
			// a space separated representation of the underlying linked list
			public String toString() {
				String str = "";

				LinkedNode cur = front;
				while (cur != null) {
					str += cur.x + " ";
					cur = cur.next;
				}

				return str;
			}
    public void removeBottomHalf(LinkedStack modList) { // Method will remove the elements from the bottom stack
		int x = (modList.size() / 2);  // Declare an initializes variables
			LinkedNode currentNode = modList.front;
            for (int index = 1; index < x; index++) {  // Loop through till the middle node of the LinkedList is found
					currentNode = currentNode.next;
				}
				currentNode.next = null; // Set node to null to break link
			}	
	}