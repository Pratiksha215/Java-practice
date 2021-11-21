package p3;

public class ImpleClass2 implements Computable,Printable{

	@Override
	public void print(String mesg) {
		System.out.println("Printing a mesg in uppercase "+mesg.toUpperCase());
		
	}

	@Override
	public double compute(double d1, double d2) {
		// TODO Auto-generated method stub
		return d1*d2;
	}

}
