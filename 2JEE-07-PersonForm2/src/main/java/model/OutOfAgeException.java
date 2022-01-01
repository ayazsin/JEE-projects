package model;

import java.io.IOException;

@SuppressWarnings("serial")
public class OutOfAgeException extends Exception{
	
	public static void outOfage(int age) throws OutOfAgeException {
		if ( age > 100 ) {
			throw (new OutOfAgeException());
		}
	}

}
