package homework4;

public class Queue {
	int size;
	Node head;
	Node tail;
	Queue (){
		size = 0;
		head = null;
		
	}
	void enqueue (int data){
		Node node = new Node (data);
		if (size == 0){
			head = node; 
			tail = node;
			size++;
		}
		else {
			tail.setNext(node);
			tail = node;
			size++;
		}
	}
	int dequeue() {
		if (size ==0){
			System.out.println("list is empty");
			return 0;
			
		}
		else {
			Node temp = head;
			head = head.getNext();
			if (tail == temp)
					tail = null;
			size--;
			return temp.getData();
			
			
		}
	}
	//peek method
	int peek(){
		return head.getData();
		
		}

	void print () {
		Node temp = head;
		for (int i=0; i<size; i++) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
		
	}
	
	private class Node{
		int data;
		Node next;
		Node (int data){
			this.data = data;
	
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		public int getData() {
			return data;
		}
		public void setData(int data) {
			this.data = data;
		}
	}
	
	public static void main (String[] args){
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
		q.print();

	}
}
