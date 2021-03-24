package jutils.log;

import java.io.PrintStream;

public class LogLevel {
	
	public static final LogLevel INFO = new LogLevel("INFO  ", System.out);
	public static final LogLevel SYSTEM = new LogLevel("SYSTEM", System.out);
	public static final LogLevel ERROR = new LogLevel("ERROR ", System.err);
	public static final LogLevel DATABASE = new LogLevel("DATA  ", System.out);
	
	
	private String tag;
	private PrintStream stream;
	
	
	/**
	 * Creates a LogLevel object with the specified tag and stream
	 * @param tag the tag representing the level
	 * @param stream where to print the logs
	 */
	public LogLevel(String tag, PrintStream stream) {
		this.tag = tag;
		this.stream = stream;
	}
	
	
	public String getTag() {
		return tag;
	}
	
	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public PrintStream getStream() {
		return stream;
	}
	
	public void setStream(PrintStream stream) {
		this.stream = stream;
	}
}
