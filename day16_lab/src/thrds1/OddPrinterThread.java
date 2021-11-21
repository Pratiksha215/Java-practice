package thrds1;

public class OddPrinterThread extends Thread {
	private int strt,end;

	public OddPrinterThread(int strt, int end,String nm) {
		super(nm);
		this.strt = strt;
		this.end = end;
		start();
	}
	@Override
	public void run()
	{
		System.out.println(getName()+" strted ");
		try {
			for(int i=strt;i<=end;i++)
			{
				if(i % 2 != 0)
					System.out.println(getName()+" No : "+i);
				Thread.sleep(123);
			}
		}catch (Exception e) {
			System.out.println(getName()+" got error "+e);
		}
		System.out.println(getName()+" over ");
	}

}
