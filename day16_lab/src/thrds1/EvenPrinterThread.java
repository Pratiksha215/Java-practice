package thrds1;

public class EvenPrinterThread extends Thread {
	private int strt,end;

	public EvenPrinterThread(int strt, int end,String name) {
		super(name);
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
				if(i % 2 == 0)
					System.out.println(getName()+" No : "+i);
				Thread.sleep(250);
			}
		}catch (Exception e) {
			System.out.println(getName()+" got error "+e);
		}
		System.out.println(getName()+" over ");
	}

}
