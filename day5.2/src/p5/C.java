package p5;

public class C implements A,B{

	@Override
	public void show() {
		System.out.println("In c's show "+A.data+" "+B.data);
		
	}

}
