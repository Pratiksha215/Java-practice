package exc;

public class TestCheckedException2 {

	public static void main(String[] args) throws InterruptedException{

		System.out.println("Before");
		Thread.sleep(3000);
		System.out.println("After");

		System.out.println("main over...");

	}

}
