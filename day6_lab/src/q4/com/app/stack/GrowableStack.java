package q4.com.app.stack;

import q4.custom_excs.StackHandlingException;

public class GrowableStack implements Stack {

	private int top;
	private Employee[] emps;

	public GrowableStack() {
		super();
		this.top = -1;
		this.emps = new Employee[Stack.STACK_SIZE];
	}

	@Override
	public void push(Employee e) {
		if (top < emps.length - 1) {
			emps[++top] = e;
			System.out.println("Pushed:\n" + emps[top].toString());
		}

		else {
			Employee[] temp = new Employee[emps.length * 2];
			for (int i = 0; i < emps.length; i++) {
				temp[i] = emps[i];
			}
			emps = temp;
			emps[++top] = e;
			System.out.println("Pushed:\n" + emps[top].toString());
		}

	}

	@Override
	public Employee pop() throws StackHandlingException {
		
		if (top == -1)
			throw new StackHandlingException("Stack Underflow");
		
		System.out.println("Poped: " + emps[top].toString());
		return emps[top--];
		

	}

	@Override
	public String toString() {
		if(top==-1)
			System.out.println("Stack is Empty");
		else
		for (int i = 0; i <= top; i++) {
			System.out.println(emps[i].toString());
		}
		return null;
	}

}
