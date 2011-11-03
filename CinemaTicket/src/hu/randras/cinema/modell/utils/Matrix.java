package hu.randras.cinema.modell.utils;

public class Matrix {

	boolean[][] representation;
	
	public Matrix(int n, int m) {
		assert n > 0;
		assert m > 0;
		representation = new boolean[n][n];
	}
	
	public void set(int i, int j, boolean value) {
		assert i < representation.length && i >= 0 : "ArrayIndexOutOfBounds"; 
		assert j < representation[0].length && j >= 0 : "ArrayIndexOutOfBounds"; 
		
		representation[i][j] = value;
	}
	
	public boolean get(int i, int j) {
		assert i < representation.length && i >= 0 : "ArrayIndexOutOfBounds"; 
		assert j < representation[0].length && j >= 0 : "ArrayIndexOutOfBounds";
		
		return representation[i][j];
	}
	
}
