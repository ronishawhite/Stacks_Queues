package homework4;

public class Driver {
	
	static int size=5;
	
	
	public static void main(String args[])
	{
		Stack s=new Stack(3);
		s.push(3);
		s.push(34);
		s.push(33);
		
		Stack s2 = new Stack(3); 
		Queue q= new Queue();
	
		System.out.println("stack to queue:");
		stack_to_queue( s, q); 
	
		System.out.println("queue to stack:");
		queue_to_stack(q, s);
		System.out.println();
		System.out.println("stack to stack:");
		stack_to_stack(s, s2);
		
		
		}
		//objects and declarations for stacks and queues. 	
		
		
		 //new stack created//make a new stack object
		//pushing the elements
	
		
		 //s.print will print the stack, by popping from it.
		//similarily, you can make a queue object, and then enqueue into it and dequeue from it.
	
		//drive 
		 //to transfer from queue q to stack s.
	
	public static void stack_to_queue(Stack s,Queue q)		//copy from s to q
	{
		int size = s.getTop();
		for(int i=0;i<=size;i++)
		{
			q.enqueue(s.pop());
		}
		q.print();
	}
		
	public static void queue_to_stack(Queue q,Stack s)		//copy from q to s
	{
		int size = q.size;
		Stack s1=new Stack(size);
		for(int i=0;i<size;i++)
		{
			s1.push(q.dequeue());
		}
		
		for(int i=0;i<size;i++)
		{
			s.push(s1.pop());
		}
		
	s.print();
	}
	
	
		
	public static void stack_to_stack(Stack s1,Stack s2)	//copy from s1 to s2
	{	
		int size = s1.getTop(); 
		Stack s3=new Stack(size+1);
		

		for(int i=0;i<=size+1;i++)
		{
			s3.push(s1.pop());
		}

		for(int i=0;i<=size;i++)
		{
			s2.push(s3.pop());
		}
		
		s2.print();
		
		
		
	}
	

}