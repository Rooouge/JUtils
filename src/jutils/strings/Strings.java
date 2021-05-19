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
	 * <p>
	 * Returns a String represented by the binary values of each character 
	 * of the input string. The format specifies how the output string is 
	 * formatted (REMEMBER TO PASS AN AVAILABLE FORMAT [%s & derived]).<br>
	 * If the boolean results of {@link Strings.isVoid(format)} will be used the default format "%s".<br>
	 * If the boolean results of {@link Strings.isVoid(separator)} will be used the default separator "".
	 * </p>
	 * <p>
	 * Es.<br>
	 * binary("ABC", null, "%8s") returns "010000010100001001000011"<br>
	 * binary("ABC", "-", "%8s")  returns "01000001-01000010-01000011"<br>
	 * binary("ABC", null, null)  returns "110001110010110011"<br>
	 * binary("ABC", "-", null)   returns "110001-110010-110011"<br>
	 * </p>
	 * 
	 * @param string the input string to convert
	 * @param separator the character separating each value
	 * @param format the format to use to print each value
	 * @return a string with the binary values of each character of the input string in the given format
	 */
	public static String binary(String string, String separator, String format) {
		if(Strings.isVoid(separator))
			separator = "";
		int toCut = separator.length();
		
		if(Strings.isVoid(format))
			format = "%s";
		
		StringBuilder b = new StringBuilder(string.length());
		
		for(char c : string.toCharArray()) {
			b.append(String.format(format, Integer.toBinaryString((int) c)).replace(" ", "0") + separator);
		}
		
		String toReturn = b.toString();
		toReturn = cutLastChars(toReturn, toCut);
		
		return toReturn;
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
