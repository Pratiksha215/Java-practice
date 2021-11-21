package utils;
import cust_excs.StudentHandlingException;
import static com.app.stud.Subject.*;

import com.app.stud.Subject;

public class ValidateStudent {
	
	public static Subject parseNvalidate(String subject)
	{
		return Subject.valueOf(subject.toUpperCase());
	}
	
	

}
