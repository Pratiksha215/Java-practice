package q4.com.app.stack;

import q4.custom_excs.StackHandlingException;

public interface Stack {
	public static final int STACK_SIZE = 3;
	public abstract void push(Employee e) throws StackHandlingException;
	public abstract Employee pop() throws StackHandlingException;
}
