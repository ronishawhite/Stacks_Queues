package homework4;

public class Queue {
	private int size;
	private int[] array;
	private int head;
	private int tail;
	
	
	public Queue(int size)
	{
		this.size=size;
		array=new int[size+1];	//the queue is of size n-1 when the array is of size n
		this.head=0;
		this.tail=this.head;	//the queue is empty when initialized, Q.head=Q.tail=0;
	}
	public String enqueue(int element)
	{
		if(this.head==this.tail+1) return "Overflow";
		if(this.tail==array.length-1){
			array[this.tail]=element;
			this.tail=0;
			return "Enqueued";
		}
		else{
			array[this.tail]=element;
			this.tail=this.tail+1;
			return "Enqueued";
		}
	}
	public String dequeue()
	{
		if(this.head==this.tail) return "Underflow";
		
		else
		{
			this.head=this.head+1;
			int dq=array[this.head-1];
			array[this.head-1]=0;
			return Integer.toString(dq);
		}
	}