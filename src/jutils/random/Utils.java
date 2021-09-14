package jutils.random;

import java.awt.Toolkit;

public class Utils {

	/**
	 * Shortcut to {@link Toolkit} beep
	 */
	public static void beep() {
		Toolkit.getDefaultToolkit().beep();
	}
	
	public static int minorEqualsMajor(int first, int second) {
		if(first < second)
			return 1;
		
		if(first > second)
			return -1;
		
		return 0;
	}
	
	public static int minorEqualMajor(double first, double second) {
		if(first < second)
			return 1;
		
		if(first > second)
			return -1;
		
		return 0;
	}
}
