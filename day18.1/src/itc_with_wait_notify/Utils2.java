package itc_with_wait_notify;

public class Utils2 {
	private Emp e;
	private boolean dataReady;

	public synchronized void writeData(Emp ref) throws Exception {
		System.out.println("w entered --- " + Thread.currentThread().getName());
		// Is producer thrd owner of the monitor / lock : YES
		while (dataReady)
			this.wait();// Producer : Blocked on wait (outside) => waiting outside monitor
		// produce data
		e = ref;
		System.out.println("Write Data " + e);
		System.out.println("w exited --- " + Thread.currentThread().getName());
		dataReady = true;// inform consumer that data is rdy .
		// Producer has produced data : MUST wake up(un block) consumer thread.(any
		// thread which is blocked on wait on the same obj's monitor)
		this.notify();
	}

	public synchronized Emp readData() throws Exception {
		System.out.println("r entered --- " + Thread.currentThread().getName());
		while (!dataReady)
			this.wait();//Consumer : blocked on wait : outside monitor
		// consume data
		System.out.println("Read  Data " + e);

		System.out.println("r exited --- " + Thread.currentThread().getName());
		dataReady = false;// inform producer that data is read by consumer
		this.notify();//un blocks any thread(producer) which is waiting on the same obj's monitor
		return e;
	}

}
