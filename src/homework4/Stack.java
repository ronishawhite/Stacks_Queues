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
	public String push(int element)
	{
		//check if the stack is not full
		if(this.top==this.size-1) return "Overflow";
		else{
			this.top=this.top+1;
			this.array[this.top]=element;
			return	"Pushed successfully";
		}
		