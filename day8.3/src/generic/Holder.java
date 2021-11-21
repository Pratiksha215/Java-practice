package generic;
//Create a Holder class : generic class : parameterized type info is included in class declaration
public class Holder<T> {//T : type
	//state
	private T ref;

	public Holder(T ref) {
		super();
		this.ref = ref;
	}

	public T getRef() {
		return ref;
	}
	
	

}
