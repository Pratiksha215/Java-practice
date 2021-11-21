package custom_exceptions;

@SuppressWarnings("serial")
public class StudentHandlingException extends Exception {
	public StudentHandlingException(String errMesg) {
		super(errMesg);
	}
}
