package core;

public interface IStack {
	boolean isEmpty();
	int getSize();
	boolean isFull();
	Object top();
	void push(Object elm) throws Exception;
	Object pop();

}
