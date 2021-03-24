package jutils.datetime;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JDates {

	public static final SimpleDateFormat yyyyMMdd = new SimpleDateFormat("yyyyMMdd");
	public static final SimpleDateFormat ddMMyyyy = new SimpleDateFormat("ddMMyyyy");
	
	
	private static Calendar getCalendar() {
		return Calendar.getInstance();
	}
	
	/**
	 * Gets field value for current date (" new Date(); ")
	 * @param field the field you want to get the value (use Calendar class fields)
	 * @return the value of the field
	 */
	public static int getNowField(int field) {
		Calendar c = getCalendar();
		c.setTime(new Date());
		
		return c.get(field);
	}
	
	/**
	 *  Gets field value for the date argument
	 * @param date the date you want to get the field value
	 * @param field the field you want to get the value (use Calendar class fields)
	 * @return the value of the field
	 */
	public static int getField(Date date, int field) {
		Calendar c = getCalendar();
		c.setTime(date);
		
		return c.get(field);
	}
	
	
	
}
