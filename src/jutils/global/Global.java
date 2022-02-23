package jutils.global;

import java.util.HashMap;
import java.util.Map;

import lombok.experimental.UtilityClass;

@UtilityClass
public class Global {

	private Map<String, Object> map;
	
	
	static {
		map = new HashMap<>();
	}
	
	
	public void add(String key, Object obj) {
		map.put(key, obj);
	}
	
	public <T> T remove(String key, Class<T> clazz) {
		return clazz.cast(map.remove(key));
	}
	
	public <T> T get(String key, Class<T> clazz) {
		return clazz.cast(map.get(key));
	}
	
}
