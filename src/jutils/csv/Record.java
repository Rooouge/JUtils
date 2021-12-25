package jutils.csv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import lombok.Getter;

public class Record {

	@Getter
	protected List<String> values;
	protected String rawValues;
	
	
	protected Record(String rawValues, String regex, int limit) {
		this.rawValues = rawValues;
		values = Arrays.asList(rawValues.split(regex,limit));
	}
	
	
	public String string(int index) {
		return values.get(index);
	}
	
	public int intNumber(int index) {
		return Integer.parseInt(string(index));
	}
	
	public double doubleNumber(int index) {
		return Double.parseDouble(string(index));
	}
	
	public Date date(int index, SimpleDateFormat sdf) throws ParseException {
		return sdf.parse(string(index));
	}
	
	
	public String toString() {
		return rawValues;
	}
	
}
