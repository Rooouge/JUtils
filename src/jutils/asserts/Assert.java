package jutils.asserts;

import java.util.List;

import jutils.collections.Arrays;

public class Assert {
	
	/*
	 * Base Assertions
	 */
	
	public static void isTrue(boolean expression, String msg) throws AssertException {
		if(!expression)
			throw new AssertException(msg);
	}
	
	public static void isFalse(boolean expression, String msg) throws AssertException {
		isTrue(!expression, msg);
	}
	
	public static void isTrue(boolean expression) throws AssertException {
		isTrue(expression, "The given expression is false");
	}
	
	public static void isFalse(boolean expression) throws AssertException {
		isFalse(expression, "The given expression is true");
	}
	
	/*
	 * Null objects
	 */
	
	public static void isNull(Object obj, String msg) throws AssertException {
		isTrue(obj == null, msg);
	}
	
	public static void notNull(Object obj, String msg) throws AssertException {
		isFalse(obj == null, msg);
	}
	
	public static void isNull(Object obj) throws AssertException {
		isNull(obj, "The given object is not null");
	}
	
	public static void notNull(Object obj) throws AssertException {
		notNull(obj, "The given object is null");
	}
	
	/*
	 * Empty objects
	 */
	
	public static void isEmpty(Object[] array, String msg) throws AssertException {
		isTrue(array.length == 0, msg);
	}
	
	public static void isNotEmpty(Object[] array, String msg) throws AssertException {
		isFalse(array.length == 0, msg);
	}
	
	public static void isEmpty(Object[] array) throws AssertException {
		isEmpty(array, "The given array is not empty");
	}
	
	public static void isNotEmpty(Object[] array) throws AssertException {
		isNotEmpty(array, "The given array is not empty");
	}
	
	public static void isEmpty(String s) throws AssertException {
		isEmpty(Arrays.convertToWrapperArray(new int[s.length()]), "The given string '" + s + "' is not empty");
	}
	
	public static void isNotEmpty(String s) throws AssertException {
		isNotEmpty(Arrays.convertToWrapperArray(new int[s.length()]), "The given string '" + s + "' is empty");
	}
	
	public static void isTrimEmpty(String s) throws AssertException {
		isEmpty(s.trim());
	}
	
	public static void isTrimNotEmpty(String s) throws AssertException {
		isNotEmpty(s.trim());
	}
	
	public static <T> void isEmpty(List<T> list, String msg) throws AssertException {
		isTrue(list.size() == 0, msg);
	}
	
	public static <T> void isNotEmpty(List<T> list, String msg) throws AssertException {
		isFalse(list.size() == 0, msg);
	}
	
	public static <T> void isEmpty(List<T> list) throws AssertException {
		isEmpty(list, "The given list is not empty");
	}
	
	public static <T> void isNotEmpty(List<T> list) throws AssertException {
		isNotEmpty(list, "The given list is empty");
	}
	
}
