package jutils.collections;

public class Arrays {

	public static <T> String arrayPrettyPrint(T[] a) {
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
	
	public static Integer[] convertToWrapperArray(int[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Integer[]::new);
	}
	
	public static Long[] convertToWrapperArray(long[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Long[]::new);
	}
	
	public static Double[] convertToWrapperArray(double[] a) {
		return java.util.Arrays.stream(a).boxed().toArray(Double[]::new);
	}
	
	public static Double[] convertToWrapperArray(float[] a) {
		return java.util.Arrays.stream(castToDoublePrimitive(a)).boxed().toArray(Double[]::new);
	}
	
//	public static <T> int[] castToIntPrimitive(T[] a) {
//		int[] result = new int[a.length];
//		
//		for(int i = 0; i < result.length; i++) {
//			result[i] = (int) a[i];
//		}
//		
//		return result;
//	}
	
	public static <T> double[] castToDoublePrimitive(float[] a) {
		double[] result = new double[a.length];
		
		for(int i = 0; i < result.length; i++) {
			result[i] = (double) a[i];
		}
		
		return result;
	}
	
}
