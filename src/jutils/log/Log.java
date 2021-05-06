package jutils.log;

import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Date;

public class Log {

	
	private static void log(PrintStream stream, String tag, String msg) {
		stream.print(format(tag, msg));
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
		return timestamp() + " [" + tag + "]\t" + msg;
	}
	
	/**
	 * Logs a new line on the specified level
	 * @param level the level where to log
	 * @param msg the message to log
	 */
	public static void println(LogLevel level, String msg) {
		log(level.getStream(), level.getTag(), msg + "\n");
	}
	
	/**
	 * Logs a new line on an instance of the specified LogLevel class
	 * @param clazz the custom class to use to create a LogLevel object
	 * @param msg the message to log
	 */
	public static void println(Class<? extends LogLevel> clazz, String msg) {
		try {
			LogLevel level = clazz.newInstance();
			log(level.getStream(), level.getTag(), msg + "\n");
		} catch (InstantiationException | IllegalAccessException e) {
			Log.error("Failed to create a LogLevel instance from class " + clazz.getCanonicalName());
			e.printStackTrace();
		}
	}
	
	/**
	 * Logs on {@link LogLevel.INFO}
	 * @param msg the message to log
	 */
	public static void info(String msg) {
		println(LogLevel.INFO, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.SYSTEM}
	 * @param msg the message to log
	 */
	public static void system(String msg) {
		println(LogLevel.SYSTEM, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.ERROR}
	 * @param msg the message to log
	 */
	public static void error(String msg) {
		println(LogLevel.ERROR, msg);
	}
	
	/**
	 * Logs on {@link LogLevel.DATABASE}
	 * @param msg the message to log
	 */
	public static void database(String msg) {
		println(LogLevel.DATABASE, msg);
	}
	
}
