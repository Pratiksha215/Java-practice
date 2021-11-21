package nested_class;

public class Outer {
	private int i;
	private static int j;
	static {
		j=199;
	}

	public Outer(int i) {
		super();
		this.i = i;
	}

	// static method
	public static void show() {
		System.out.println("outer's static method " + j);
		//can you access inner cls's private members from outer's static method? : YES
		//HOW : Create outer cls's instance n within such an enclosing instance create inner cls instance
		Outer outer=new Outer(23);
		Outer.Nested inner=outer.new Nested(67);
		inner.displayInner();
		
	}

	// non static (instance) method
	public void display() {
		System.out.println("outer's non-static method " + this.i + " " + j);
		//can you access inner cls's private members from outer's non static method? : YES(NOT DIRECTLY)
		//By creating inner cls instance
		Nested ref=new Nested(123);
		System.out.println(ref.l+" static member "+Nested.k);//ref.k is also legal BUT not reco.
	}

	// non static nested class : inner class
	public class Nested {
		// can contain only non static members
		private static final int k = 100;
		private int l;

		/*
		 * can't contain any static init block static { k=10; }
		 */
		// constr
		public Nested(int l) {
			super();
			this.l = l;
		}

		/*
		 * public static void test() { can't contain any static methods }
		 */
		// non static method
		void displayInner() {
			// can access DIRECTLY (w/o instantiating outer class) ALL (static n non static)
			// members of outer class
			System.out.println("Via display inner : " + i + " " + j + " " + k + " " + l);
		}

	}

}
