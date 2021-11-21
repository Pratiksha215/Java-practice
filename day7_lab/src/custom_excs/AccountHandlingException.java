package custom_excs;

@SuppressWarnings("serial")
public class AccountHandlingException extends Exception {
	public AccountHandlingException(String errMesg) {
		super(errMesg);
	}
}
