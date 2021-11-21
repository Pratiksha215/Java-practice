package q4.com.app.stack;

public interface Stack {
	public static final int STACK_SIZE = 3;
	public abstract void push(Employee e);
	public abstract Employee pop();
}
