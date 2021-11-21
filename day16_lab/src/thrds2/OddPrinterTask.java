package thrds2;

public class OddPrinterTask implements Runnable {
	private int strt,end;

	public OddPrinterTask(int strt, int end) {
		
		this.strt = strt;
		this.end = end;
	
	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+" strted ");
		try {
			for(int i=strt;i<=end;i++)
			{
				if(i % 2 != 0)
					System.out.println(Thread.currentThread().getName()+" No : "+i);
				Thread.sleep(250);
			}
		}catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got error "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over ");
	}

}
