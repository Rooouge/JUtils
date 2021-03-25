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
	 * Creates a LogLevel object with the specified tag and stream.
	 * Any tag must be of 6 characters: if the parameter's length is < 6 then
	 * will be added N ' ' (spaces) to reach the length of 6; if the
	 * parameter's length is > 6, will be taken the substring of length 6 starting
	 * from the first character.
	 * @param tag the tag representing the level
	 * @param stream where to print the logs
	 */
	public LogLevel(String tag, PrintStream stream) {
		if(tag.length() == 6)
			this.tag = tag;
		else if(tag.length() < 6) {
			this.tag = tag;
			do {
				this.tag += ' ';
			} while(this.tag.length() < 6);
		} else
			this.tag = tag.substring(0, 6);
		
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
