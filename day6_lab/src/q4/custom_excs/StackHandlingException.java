package q4.custom_excs;

@SuppressWarnings("serial")
public class StackHandlingException extends Exception {
	public StackHandlingException(String errorMsg) {
		super(errorMsg);
	}
}
