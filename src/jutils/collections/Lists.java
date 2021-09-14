package jutils.collections;

import java.util.List;

public class Lists {

	public static <T> String prettyPrint(List<T> l) {
		String print = "{";
		
		for(int i = 0; i < l.size(); i++) {
			T t = l.get(i);
			print += t;
			
			if(i != l.size()-1)
				print += ", ";
		}
		
		print += "}";
		
		return print;
	}
	
}
