package exc;

public class TestUncheckedExc {

	public static void main(String[] args) {
		try {
			System.out.println("in try");
			int[] data = { 12, 23, 45, 10 };
			System.out.println(data[0]);// JVM : throw new ArrayIndexOutOfBounds("13");
			int a = 100;
			int b = 10;
			System.out.println("Result : " + (a / b));
			String s = "asd1234";
			System.out.println("int value " + Integer.parseInt(s));
			String s2 = null;
			System.out.println("upper case " + s2.toUpperCase());// throw new NullPointerException()
			System.out.println("end of try....");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1");
		} catch (NullPointerException e) {
			System.out.println("2");
		}
		catch (NumberFormatException | ArithmeticException e) {
			System.out.println("in multi-catch block");
		}

		catch (Exception e) {
			System.out.println("in catch-all block");
			System.out.println("toString : " + e);
			System.out.println("getMesg " + e.getMessage());
			System.out.println("via printStackTrace");
			e.printStackTrace();
		}

		System.out.println("main over..");// normal continuation of the code

	}

}
