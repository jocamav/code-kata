package com.jc.kata.karatechop;

public class KarateSearchIndexByValue extends AbstractKarateBinary {
	
	@Override
	protected int getIndex(int lowIndex, int highIndex, int value, int[] array) {
		
		if(lowIndex == highIndex) {
			return lowIndex;
		}
		
		int min = array[lowIndex];
		int max = array[highIndex];
		
		//1 -> 0
		//2 -> 5
		//3 -> 10
		
		
		int increasePerIndex = (min + max)/(highIndex-lowIndex);
		
		int nextIndex = ((value-min)/increasePerIndex)+lowIndex;
		
		return nextIndex;
	}

}
