package cust_exc;

@SuppressWarnings("serial")
public class CustomerHandlingException extends Exception{
	public CustomerHandlingException(String errMsg) {
		super(errMsg);
	}
}
