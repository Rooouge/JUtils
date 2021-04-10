package jutils.strings;

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
	
}
