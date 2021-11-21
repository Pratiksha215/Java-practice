package exc;

public class TestFinally5 {

	
	public static void main(String[] args) {
		System.out.println("1");
		try {
			testMe();
			System.out.println("back in main");
		} catch (Exception e) {
			System.out.println("in main's catch-all  " + e);
		} finally {
			System.out.println("in main's finally");
		}
		System.out.println("main over..");
	}
	private static void testMe() throws InterruptedException  {
		try {
			System.out.println("in meth's try");
			String[] ss = { "aa", "bb" };
			Thread.sleep(1000);
			System.out.println(ss[1]);
			boolean flag = true;
			if (flag)
				System.exit(0);//terminated JVM : java app
			System.out.println("end of try");
		} finally {
			//clean up 
			System.out.println("in meth's finally");
		}
		
		System.out.println("meth end");
	}

}
