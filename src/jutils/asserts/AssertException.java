package jutils.asserts;

public class AssertException extends Exception {

	private static final long serialVersionUID = 1L;
	
	
	public AssertException() {
		super();
	}
	
	public AssertException(String arg0) {
		super(arg0);
	}
	
	public AssertException(Throwable arg0) {
		super(arg0);
	}
	
	public AssertException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
}
