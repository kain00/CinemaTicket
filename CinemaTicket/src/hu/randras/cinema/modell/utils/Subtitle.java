package hu.randras.cinema.modell.utils;

import java.util.HashMap;
import java.util.Map;

public enum Subtitle {
	SUBTITLE_HU("HU"),
	SUBTITLE_EN("EN"),
	SUBTITLE_RU("RU"),
	SUBTITLE_DE("DE"),
	SUBTITLE_NO("NO");
	
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
		map.put("HU", SUBTITLE_HU);
		map.put("EN", SUBTITLE_EN);
		map.put("RU", SUBTITLE_RU);
		map.put("DE", SUBTITLE_DE);
		map.put("NO", SUBTITLE_NO);
	}
	
	@Override
	public String toString() {
		return value;
	}
	
}
