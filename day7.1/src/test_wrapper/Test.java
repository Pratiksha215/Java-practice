package test_wrapper;

import test_equals.Car;

public class Test {

	public static void main(String[] args) {
		Integer i1 = new Integer(100);// boxing(prim--->wrapper)
		System.out.println("Before "+i1);
		Integer i2 = Integer.valueOf(200);// boxing
		int data=i1.intValue();//un boxing (wrapper---prim)
		Integer i3=1234;//int-->Integer (javac) : auto boxing
		data=i3;//Integer--->int (javac) : auto un boxing
		Car c1=new Car(1234, "red", 4654757);
	//	c1++;//javac err
		i1++;//Integer-->int(auto un boxing) --inc ---auto boxing
		System.out.println("After inc  "+i1);

	}

}
