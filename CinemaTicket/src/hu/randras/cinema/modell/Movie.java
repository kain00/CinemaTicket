package hu.randras.cinema.modell;

import hu.randras.cinema.modell.utils.Subtitle;

import java.util.HashMap;
import java.util.Map;

public class Movie {
	/** Cím */
	private String title;
	/** Szarmazasi hely */
	private String origin;
	/** Felirat */
	private Subtitle subtitle;
	/** Film rendezõje */
	private String director;
	/** Rovid összefoglaló */
	private String description;
	/** Hossza percben megadva */
	private int length;
	
	
	
	
	
	
	
	
	
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public Subtitle getSubtitle() {
		return subtitle;
	}
	public void setSubtitle(Subtitle subtitle) {
		this.subtitle = subtitle;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	
}
