package hu.randras.cinema.controller;

import hu.randras.cinema.modell.utils.Matrix;

public interface IServicesToBooking {

	/** Vissza adja listaban a foglalt helyeket */
	Matrix getPlaces();
	
	/** Foglaltra állítja a megadott széket */
	void reservePlace(int row, int chair);
	
	/** Szabadra állitja a megadott széket */
	void freePlace(int row, int chair);
		
	
}
