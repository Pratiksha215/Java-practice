package nested_class2;

public class Outer {
	private int i=100;
	public static void main(String[] args) {
		//how to invoke show method ?
		Outer.Inner innerRef=new Outer().new Inner();
		innerRef.show(300);
		

	}
	class Inner
	{
		private int i=200;
		void show(int i)
		{
			//display 300 , 200 , 100
			System.out.println("method local var "+i);
			System.out.println("instance var "+this.i);
			//inner class can access DIRECTLY outer cls's members
			System.out.println("Outer's i "+Outer.this.i);
			
		}
	}

}
