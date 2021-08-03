package jutils.asserts;

public class Assert {

	public static void isNull(Object obj) throws AssertException {
		isNull(obj, "The given object is not null");
	}
	
	public static void isNull(Object obj, String msg) throws AssertException {
		if(obj != null)
			throw new AssertException(msg);
	}
	
	public static void notNull(Object obj) throws AssertException {
		isNull(obj, "The given object is null");
	}
	
	public static void notNull(Object obj, String msg) throws AssertException {
		if(obj == null)
			throw new AssertException(msg);
	}
	
	public static void isTrue(boolean expression) throws AssertException {
		isTrue(expression, "The given expression is false");
	}
	
	public static void isTrue(boolean expression, String msg) throws AssertException {
		if(!expression)
			throw new AssertException(msg);
	}
	
	public static void isFalse(boolean expression) throws AssertException {
		isFalse(expression, "The given expression is false");
	}
	
	public static void isFalse(boolean expression, String msg) throws AssertException {
		if(expression)
			throw new AssertException(msg);
	}
}
