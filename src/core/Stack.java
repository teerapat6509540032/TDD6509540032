package core;
import java.util.ArrayList;

class PushToFullStackException  extends Exception
{
public PushToFullStackException  (String str)
{
super(str);
}
}

public class Stack implements IStack {
	private int size;
	private Object data[];
	private int topStack = -1;
	
	Stack(int size){
		this.size = size;
		data = new Object[size];
	}
	
	Stack() {
		this.size = 0;
	}
	
	@Override
	public boolean isEmpty() {
		if(topStack>-1)
			return false;
		else
			return true;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public boolean isFull() {
		if(topStack < size)
			return false;
		else
			return true;
	}

	@Override
	public Object top() {
		// TODO Auto-generated method stub
		return this.data[topStack];
	}

	@Override
	public void push(Object elm) throws Exception{
		try {
		this.data[++topStack] = elm;
		}
		catch(ArrayIndexOutOfBoundsException e){
			throw new PushToFullStackException("Stack is Full");
		}
		catch(IllegalArgumentException e) {
			throw e;
		}

	}
	
	@Override
	public Object pop() {
		
		return this.data[topStack--];
	}

}
