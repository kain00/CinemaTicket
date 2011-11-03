package hu.randras.cinema.modell.utils;

import java.util.HashMap;
import java.util.Map;

public enum Subtitle {
	SUBTITLE_YES("Y"),
	SUBTITLE_NO("N");
	
	private String value;
	
	private static Map<String, Subtitle> map = new HashMap<String, Subtitle>();
	
	Subtitle(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public static Subtitle getEnumfromValue(String value) {
		return map.get(value);
	}
	
	static {
		map.put("Y", SUBTITLE_YES);
		map.put("N", SUBTITLE_NO);
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
