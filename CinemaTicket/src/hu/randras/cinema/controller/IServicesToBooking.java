package hu.randras.cinema.controller;

import hu.randras.cinema.modell.utils.Matrix;

public interface IServicesToBooking {

	/** Vissza adja listaban a foglalt helyeket */
	Matrix getPlaces();
	
	/** Foglaltra �ll�tja a megadott sz�ket */
	void reservePlace(int row, int chair);
	
	/** Szabadra �llitja a megadott sz�ket */
	void freePlace(int row, int chair);
		
	
}
