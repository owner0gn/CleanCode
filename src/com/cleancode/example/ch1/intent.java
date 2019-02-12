package com.cleancode.example.ch1;

import java.util.ArrayList;
import java.util.List;

public class intent {
	// ex1.
	public List<int[]> getThem(){
		List<int[]> list1 = new ArrayList<int[]>();
		for( int[] x : theList ) {
			if(x[0] == 4) {
				list1.add(x);
			}
			return list1;
		}
	}
	
	// ex1. solve
	public List<int[]> getFlaggedCells(){
		List<int[]> flaggedCells = new ArrayList<int[]>();
		for(int[] cell : gameBoard) {
			if (cell[STATUS_VALUE] == FLAGGED)
				flaggedCells.add(Cell);
			return flaggedCells;
		}
	}
}
