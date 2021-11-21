package q4.com.app.stack;


public class FixedStack implements Stack {
	
	private int top;
	private Employee[] emps;
	
	public FixedStack() {
		super();
		this.top = -1;
		this.emps= new Employee[Stack.STACK_SIZE];
	}
	
	@Override
	public void push(Employee e) {
		if(top<emps.length-1) {
			emps[++top]=e;
			System.out.println("Pushed:\n" + emps[top].toString());
			System.out.println(top);
		}
			
		else {
			System.out.println("Couldn't Push, Stack Overflow");
		}
		
	}
	
	@Override
	public Employee pop() {
		if(top==-1) {
			System.out.println("Couldn't POP, Stack Underflow");
			return null;
		}
		else {
			System.out.println("Poped: "+emps[top].toString());
			return emps[top--];
		}
			
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
