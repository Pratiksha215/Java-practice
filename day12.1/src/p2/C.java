package p2;

public class C implements A, B {
//MUST override duplicate default implementation
	@Override
	public void show() {
		System.out.println("1");
		//If you want to access def imple from i/f A
		A.super.show();
		//If you want to access def imple from i/f B
		B.super.show();
	}
}
