package custom_excs;

@SuppressWarnings("serial")
public class SpeedOutOfRangeException extends Exception{
	 public SpeedOutOfRangeException(String errorMesg) {
		super(errorMesg);//Invokes Exception cls's constr : to init error mesg
	}

}
