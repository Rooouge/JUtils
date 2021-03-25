package jutils.tests;

import jutils.log.Log;
import jutils.log.LogLevel;

public class JUtilsTests {

	public static void main(String[] args) {
		Log.info("Started JUtils");
		
		LogLevel test = new LogLevel("TEST", System.out);
		
		Log.println(test, "Test tag: " + test.getTag());
	}
}
