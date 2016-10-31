package homework4;

public class Stack {
	
	private int size;	//size of the stack
	private int top;
	private int[] array;
	
	public Stack(int size)
	{
		this.size=size;
		this.top=-1;	
		array=new int[size];
	}
	