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
	public String push(int i)
	{
		//check if the stack is not full
		if(this.top==size-1) return "Overflow";
		else{
			this.top=this.top+1;
			this.array[this.top]=i;
	
			return	"Pushed successfully";
		}
	}
	public int pop(){
	
		 if(this.top==-1) return -1; 
	
		 else{
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
		for(int i=top;i>=0;i--)
		{
			System.out.print(this.array[i]+", ");
		}
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub
	Stack s=new Stack(15);
	s.push(3);
	s.push(34);
	s.push(33);
	s.push(93);
	s.push(34);
	s.push(33);
	s.push(93);
	s.push(34);
	s.push(33);
	s.push(93);
	s.push(93);
	s.pop();
	s.top();
	s.push(67);
	s.print();
	}

	}
