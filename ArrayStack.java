

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
		// Implements the push operation
		void push(int e) {
			if (top==stack.length) {
				makeNewArray();
			}
			stack[top] = e;
			top++;
		}
		// Implements the pop operation
		int pop() {
			top--;
			return stack[top];
		}
		// Implements the peek operation
		int peek() {
			return stack[top-1];
		}
		// Implements the isEmpty operation
		boolean isEmpty() {
			return top==0;
		}
		// Implements the size operation
		int size() {
			return top; 
		}
	}

