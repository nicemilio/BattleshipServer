package com.example.projects.demo.Model;

public class Board {

	private Field[][] fields;
	private Ship[] ships;
	
	public Board(int x, int y) {
		fields = new Field[x][y];
		fillBoard();
	}
	
	public void fillBoard() {
		for (int i = 0; i < fields.length; i++) {
	        for (int j = 0; j < fields[i].length; j++) {
	            fields[i][j] = new Field(i,j);
	        }
	    }
	}
	
	public void printField () {
		for (int i = 0; i < fields.length; i++) {
	        for (int j = 0; j < fields[i].length; j++) {
	            System.out.print(fields[i][j].isShot() + " ");
	        }
	        System.out.println();
	    }
	}
	
	public void placeShip (int x, int y, int length, boolean horizontal) {
		// fields[x][y].placeShip(length, horizontal);
	}
	
	public boolean shootField(int x, int y) {
		return fields[x][y].shoot();
	}

	public Field[][] getFields() {
		return fields;
	}
	
}
