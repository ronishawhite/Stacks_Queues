package homework4;

public class Driver {
	
	static int size=5;
	
	
	public static void main(String args[])
	{
		
		//objects and declarations for stacks and queues. 	
		
		
		 //new stack created//make a new stack object
		//pushing the elements
	
		
		 //s.print will print the stack, by popping from it.
		//similarily, you can make a queue object, and then enqueue into it and dequeue from it.
	
		//drive 
		 //to transfer from queue q to stack s.
	}
	public void stack_to_queue(Stack s,Queue q)		//copy from s to q
	{
		for(int i=0;i<size;i++)
		{
			q.enqueue(s.pop());
		}
	}
		
	public void queue_to_stack(Queue q,Stack s)		//copy from q to s
	{
		Stack s1=new Stack(size);
		for(int i=0;i<size;i++)
		{
			s1.push(q.dequeue());
		}
		
		for(int i=0;i<size;i++)
		{
			s.push(s1.pop());
		}
		
	s1.print();
	}
	
		
	public void stack_to_stack(Stack s1,Stack s2)	//copy from s1 to s2
	{	
		
		Stack s3=new Stack(size);
		for(int i=0;i<size;i++)
		{
			s3.push(s1.pop());
		}
		for(int i=0;i<size;i++)
		{
			s2.push(s3.pop());
		}
		
		s2.print();
		
		
		
	}
	
	

}