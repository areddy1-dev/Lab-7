
	public class ArrayStack {  
		int[] stack;   
		int top;       
		ArrayStack() {
			stack = new int[10];
			top = 0;
		}
		void makeNewArray() {
			int[] newStack = new int[stack.length*2];
			for (int i=0; i<stack.length; i++)
				newStack[i] = stack[i];
			
			stack = newStack;
		}
		void push(int e) {  // Implements the push operation
			if (top==stack.length) {
				makeNewArray();
			}
			stack[top] = e;
			top++;
		}
		int pop() {  // Implements the pop operation
			top--;
			return stack[top];
		}
		int peek() {  	// Implements the peek operation
			return stack[top-1];
		}
		boolean isEmpty() {  // Implements the isEmpty operation
			return top==0;
		}
		int size() {   		// Implements the size operation.
			return top; 
		}
	}

