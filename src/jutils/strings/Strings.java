package jutils.strings;

import java.util.Formatter;

public class Strings {

	/**
	 * Returns true if s == null or s.isEmpty() == true
	 * @param s
	 * @return
	 */
	public static boolean isVoid(String s) {
		return s == null || s.isEmpty();
	}
	
	/**
	 * Returns a String formed by repetition of the given pattern:
	 * 
	 * Es. patternRepeating("Hi!", 3) returns "Hi!Hi!Hi!"
	 * 
	 * If times is < 0 then returns null; If times == 0 then returns an
	 * empty string ""
	 * 
	 * @param pattern the pattern to repeat
	 * @param times how many times the pattern must be repeated
	 * @return a String formed by repetition of the given pattern
	 */
	public static String patternRepeating(String pattern, int times) {
		if(times < 0)
			return null;
		
		String s = "";
		
		for(int i = 0; i < times; i++) {
			s += pattern;
		}
		
		return s;
	}
	
	/**
	 * Returns a String represented by the unicode values of each character 
	 * of the input string.
	 * 
	 * Es. unicode("ABC") returns "\u0041\u0042\u0043"
	 * 
	 * @param string the input string to convert
	 * @return the unicode values of each character of the input string
	 */
	public static String unicode(String string) {
		StringBuilder b = new StringBuilder(string.length());
		
		try (
			Formatter f = new Formatter(b);
		) {
			for(char c : string.toCharArray()) {
				f.format("\\u%04x", (int) c);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return b.toString();
	}
	
	/**
	 * Cut the given number of characters from the end of the string.
	 * Equivalent of 
	 * 		string.substring(0, string.length()-toCut)
	 * 
	 * @param string the input string
	 * @param toCut how many characters to cut from the end
	 * @return
	 */
	public static String cutLastChars(String string, int toCut) {
		return string.substring(0, string.length()-toCut);
	}
}
