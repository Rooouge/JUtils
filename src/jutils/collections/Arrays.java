package jutils.collections;

public class Arrays {

	public static <T> String prettyPrint(T[] a) {
		String print = "{";
		
		for(int i = 0; i < a.length; i++) {
			T t = a[i];
			print += t;
			
			if(i != a.length-1)
				print += ", ";
		}
		
		print += "}";
		
		return print;
	}
	
	/*
	 * 
	 */
	
	public static Integer[] convertToWrapperArray(int[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Integer[]::new);
	}
	
	public static Long[] convertToWrapperArray(long[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Long[]::new);
	}
	
	public static Double[] convertToWrapperArray(double[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Double[]::new);
	}
	
	public static Integer[] convertToWrapperArray(char[] a) {
		return java.util.Arrays.stream(castToIntPrimitive(a)).boxed().toArray(Integer[]::new);
	}
	
	public static int[] castToIntPrimitive(char[] a) {
		int[] result = new int[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (int) a[i];
		}
		
		return result;
	}
	
	public static Integer[] convertToWrapperArray(boolean[] a) {
		return java.util.Arrays.stream(castToIntPrimitive(a)).boxed().toArray(Integer[]::new);
	}
	
	public static int[] castToIntPrimitive(boolean[] a) {
		int[] result = new int[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = a[i] ? 1 : 0;
		}
		
		return result;
	}
	
	public static Integer[] convertToWrapperArray(byte[] a) {
		return java.util.Arrays.stream(castToIntPrimitive(a)).boxed().toArray(Integer[]::new);
	}
	
	public static int[] castToIntPrimitive(byte[] a) {
		int[] result = new int[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (int) a[i];
		}
		
		return result;
	}
	
	public static Integer[] convertToWrapperArray(short[] a) {
		return java.util.Arrays.stream(castToIntPrimitive(a)).boxed().toArray(Integer[]::new);
	}
	
	public static int[] castToIntPrimitive(short[] a) {
		int[] result = new int[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (int) a[i];
		}
		
		return result;
	}
	
	public static Double[] convertToWrapperArray(float[] a) {
		return java.util.Arrays.stream(castToDoublePrimitive(a)).boxed().toArray(Double[]::new);
	}
	
	public static double[] castToDoublePrimitive(float[] a) {
		double[] result = new double[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (double) a[i];
		}
		
		return result;
	}
	
}
