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
	