package hu.randras.cinema.controller;

import hu.randras.cinema.modell.Movie;
import hu.randras.cinema.modell.Presentation;
import hu.randras.cinema.modell.Room;

import java.util.Date;

public interface IServicesToCreatePresentation {

	/** */
	Presentation createPresentation(Room room, Movie movie, Date start);
	
}
