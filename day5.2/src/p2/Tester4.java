package p2;

public class Tester4 {

	public static void main(String[] args) {
		Computable[] computables= {new MyComputable(),new OtherComputable()};
		for(Computable c : computables)//c=MyComputable , c=OtherComputable
		{
			System.out.println(c.compute(12, 13));
			//how to invoke isEven ?
			if(c instanceof MyComputable)
				System.out.println("Is Even "+((MyComputable)c).isEven(1234));
			else
				System.out.println("Invalid type!!!!!");
			
		}

	}

}
