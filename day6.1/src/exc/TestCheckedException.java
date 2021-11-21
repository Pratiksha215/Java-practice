package exc;

public class TestCheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("Before");
			Thread.sleep(3000);
			System.out.println("After");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("main over...");

	}

}
