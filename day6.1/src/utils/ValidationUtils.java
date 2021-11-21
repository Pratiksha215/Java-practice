package utils;

import custom_excs.SpeedOutOfRangeException;

public class ValidationUtils {
	//add speed limits
	public static final int MIN_SPEED,MAX_SPEED;
	static {
		MIN_SPEED=40;
		MAX_SPEED=80;
	}
	//validation rule
	public static void validateSpeed(int speed)  throws SpeedOutOfRangeException 
	{
		//chk for min speed
		if(speed < MIN_SPEED)
			throw new SpeedOutOfRangeException("You are driving too slow !!!!!!");
		if(speed > MAX_SPEED)
			throw new SpeedOutOfRangeException("You are driving too fast  !!!!!!");
		System.out.println("Speed within range ...Continue ...");
		
	}
	

}
