package jutils.log;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class LogFileFormatter extends Formatter {
	
	@Override
	public String format(LogRecord record) {
		return record.getMessage();
	}

}
