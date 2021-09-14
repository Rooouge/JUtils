package jutils.gui;

import java.awt.Color;

import jutils.collections.Arrays;
import jutils.random.Utils;

public class Colors {

	public static final Color GRAY_32 = gray(32);
	public static final Color GRAY_48 = gray(48);
	public static final Color GRAY_64 = gray(64);
	
	public static final Color CYAN = new Color(0, 100, 160);
	
	
	public static Color red(int amount) {
		return new Color(amount, 0, 0);
	}
	
	public static Color green(int amount) {
		return new Color(0, amount, 0);
	}
	
	public static Color blue(int amount) {
		return new Color(0, 0, amount);
	}
	
	public static Color gray(int amount) {
		return new Color(amount, amount, amount);
	}
	
	
	public static String printRgb(Color c) {
		return "RGB: " + Arrays.prettyPrint(Arrays.convertToWrapperArray(rgbIntColorComponents(c)));
	}
	
	public static int[] rgbIntColorComponents(Color c) {
		int[] result = new int[3];
		
		if(c == null)
			return result;
		
		result[0] = c.getRed();
		result[1] = c.getGreen();
		result[2] = c.getBlue();
		
		return result;
	}
	
	public static Color convertRGBToARGB(Color color, int transparency) {
		return new Color(color.getRed(), color.getGreen(), color.getBlue(), transparency);
	}
	
	public static int brighter(Color c1, Color c2) {
		int rgbSum1 = java.util.Arrays.stream(rgbIntColorComponents(c1)).sum();
		int rgbSum2 = java.util.Arrays.stream(rgbIntColorComponents(c2)).sum();
		
		return Utils.minorEqualsMajor(rgbSum1, rgbSum2);
	}
	
	public static int darker(Color c1, Color c2) {
		return brighter(c1, c2);
	}
	
	public static boolean isBrighter(Color c1, Color c2) {
		return brighter(c1, c2) < 0;
	}
	
	public static boolean isDarker(Color c1, Color c2) {
		return brighter(c1, c2) > 0;
	}
	
	public static boolean isBrightEqual(Color c1, Color c2) {
		return brighter(c1, c2) == 0;
	}
	
	public static int[] rgbDiff(Color c1, Color c2) {
		int[] rgb1 = rgbIntColorComponents(c1);
		int[] rgb2 = rgbIntColorComponents(c2);
		
		int[] result = new int[rgb1.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = rgb1[i] - rgb2[i];
		}
		
		return result;
	}
}
