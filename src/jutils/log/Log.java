package jutils.log;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

import jutils.config.Config;
import jutils.strings.Strings;

public class Log {
	
	static {
		boolean logFileEnable = Boolean.parseBoolean(Config.getValue("log-file-enable"));
		File file = new File(Config.getValue("log-file"));
		
		LogProperties.logFileEnable = logFileEnable;
		LogProperties.logFile = file;
		
		try {
			if(logFileEnable) {
				
				if(file.exists()) {
					if(file.isDirectory()) {
						String systemName = getProjectName();
						file = new File(file, systemName);
					}
				} else {
					if(file.isDirectory()) {
						if(!file.mkdirs())
							throw new IOException("Failed to create log file: " + file.getAbsolutePath());
						String systemName = getProjectName();
						file = new File(file, systemName);
					}
				}
				
				if(!file.exists() && !file.createNewFile())
					throw new IOException("Failed to create log file: " + file.getAbsolutePath());
				
				Logger logger = Logger.getLogger(file.getName());
				FileHandler fh = new FileHandler(file.getAbsolutePath());
				fh.setFormatter(new LogFileFormatter());
				logger.addHandler(fh);
				logger.setUseParentHandlers(false);
				
				LogProperties.logger = logger;
				
				system("File logging enabled");
				system("Loggin to file: " + file.getAbsolutePath());
			}
			else {
				system("File logging disabled");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static String getProjectName() {
		String project = Config.getValue("project");
		
		if(project == null || project.trim().isEmpty())
			project = new File(System.getProperty("user.dir")).getName();
		
		return project + ".log";
	}
	
	private static void log(PrintStream stream, String tag, String msg) {
		String log = format(tag, msg);
		stream.print(log);
		
		if(LogProperties.logFileEnable && LogProperties.logger != null)
			LogProperties.logger.info(log);
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
		return timestamp() + " [" + tag + "]" + Strings.patternRepeating(" ", 6 - tag.length()) + "\t" + msg;
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
