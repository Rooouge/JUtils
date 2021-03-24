package jutils.log;

import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Date;

public class Log {

	
	private static void log(PrintStream stream, String tag, String msg) {
		stream.println(format(tag, msg));
	}
	
	private static String timestamp() {
		String defPattern = "yyyy-MM-dd HH:mm:ss.SSS";
		
		Timestamp ts = new Timestamp(new Date().getTime());
		
		String tsString = "" + ts;
		while (tsString.length() < defPattern.length()) {
			tsString += '0';
		}
		
		return "[" + tsString + "]";
	}
	
	private static String format(String tag, String msg) {
		return timestamp() + " [" + tag + "]\t" + msg + "\n";
	}
	
	/**
	 * Logs on the specified level
	 * @param level the level where to log
	 * @param msg the message to log
	 */
	public static void log(LogLevel level, String msg) {
		log(level.getStream(), level.getTag(), msg);
	}
	
	/**
	 * Logs on {@link LogLevel.INFO}
	 * @param msg the message to log
	 */
	public static void info(String msg) {
		log(LogLevel.INFO, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.SYSTEM}
	 * @param msg the message to log
	 */
	public static void system(String msg) {
		log(LogLevel.SYSTEM, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.ERROR}
	 * @param msg the message to log
	 */
	public static void error(String msg) {
		log(LogLevel.ERROR, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.DATABASE}
	 * @param msg the message to log
	 */
	public static void database(String msg) {
		log(LogLevel.DATABASE, msg);
	}
	
}
