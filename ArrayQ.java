
public class ArrayQ {

	   private final int DEFAULT_CAPACITY = 10;
	   private int front, rear, count;
	   private int[] queue;
	   public ArrayQ()
	   {
	      front = rear = count = 0;
	      queue = new int[DEFAULT_CAPACITY];
	   }

	   //  Adds the specified element to the rear of the queue.
	   public void enqueue (int element) {
	      if (count == queue.length)
	          expandCapacity();

	       queue[rear] = element;
	       rear = (rear+1) % queue.length;
	       count++;	   
	   }
	   public void expandCapacity()
	   {
	      int[] larger = new int[queue.length*2];

	      for (int index=0; index < count; index++)
	         larger[index] = queue[(front+index) % queue.length];

	      front = 0;
	      rear = count;
	      queue = larger;
	   }
	   
	   
	   //  Removes and returns the element at the front of the queue.
	   public int dequeue() {
		   if (count==0) return -1;
		   int x = queue[front];
	       front = (front+1) % queue.length;
	       count--;
		   return x;
	   }

	   //  Returns a reference to the element at the front of the queue, without removing it.
	  
	   public int first() {
		   return queue[front];
	   }
	   public boolean isEmpty() {  //  Returns true if the queue contains no elements and false, otherwise.
		   return count==0;
	   }
	   public int size() {  //  Returns the number of elements in the queue.
		   return count;
	   }
	   public String toString() {  //  Returns a string representation of the queue.
		   return "";
	   }

}
