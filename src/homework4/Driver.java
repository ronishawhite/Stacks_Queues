package homework4;

public class Driver {
	
	static int size=5;
	
	
	public static void main(String args[])
	{
		
		//objects and declarations for stacks and queues. 	
		
		Stack s=new Stack(size);	//make a new stack object
		//pushing the elements
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		
		s.print(); //s.print will print the stack, by popping from it.
		//similarily, you can make a queue object, and then enqueue into it and dequeue from it.
	}