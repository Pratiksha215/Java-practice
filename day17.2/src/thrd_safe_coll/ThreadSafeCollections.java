package thrd_safe_coll;

import java.util.*;

public class ThreadSafeCollections {
	public static void main(String[] args) throws Exception {
		List<Integer> list = new ArrayList<>(10000);
		for (int i = 0; i < 10000; i++)
			list.add(i);
		// Thread(Runnable instance,String name)
		Thread reader = new Thread(() -> {
			synchronized (list) {
				list.forEach(i -> System.out.println(i));
			}

		}, "t1");
		Thread writer = new Thread(() -> {
			for (int i = 10000; i < 20000; i++) {
			synchronized (list) {
				list.add(i);
				}
			}
		}, "t2");
		reader.start();
		writer.start();
		reader.join();
		writer.join();
		System.out.println("main over...");
	}
}