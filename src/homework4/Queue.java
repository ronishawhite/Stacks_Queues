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
		if(this.head==this.tail) return "-1";
		
		else
		{
			this.head=this.head+1;
			String dq=array[this.head-1];
			array[this.head-1]=0;
			return dq;
		}
	}
	public void print()
	{
		for(int i=0;i<array.length;i++)
		{
			System.out.print(array[i]+", ");
			
		}
		System.out.println();
		System.out.print("Head: "+this.head+", ");
		System.out.println("Tail: "+this.tail);
	}


public static void main(String[] args) 
{
    // TODO Auto-generated method stub
    Queue q= new Queue();
    q.dequeue();
    q.enqueue(1);
    q.enqueue(2);
    q.enqueue(3);
    q.enqueue(4);
    q.enqueue(5);
    q.dequeue();
    q.enqueue(6);
    q.enqueue(7);
    q.enqueue(8);
    q.enqueue(9);
    q.dequeue();
    q.enqueue(10);
    q.enqueue(11);
    q.enqueue(12);
    q.enqueue(13);
    q.print();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.dequeue();
    q.print();
    q.dequeue();
}

}