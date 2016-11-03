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
	public String push()
	{
		//check if the stack is not full
		if(this.top==this.size-1) return "Overflow";
		else{
			this.top=this.top+1;
			this.array[this.top]=string;
			return	"Pushed successfully";
		}
	}
	public int pop(){
	{
		 if(this.top==-1) return -1; 
	
		 else
			this.top=this.top-1;
			return array[this.top+1];
	}
	}
	
	public int top()
	{
		return this.top;
	}
	public void print()
	{
		for(int i=0;i<this.array.length;i++)
		{
			System.out.print(this.array[i]+", ");
		}
	}

}