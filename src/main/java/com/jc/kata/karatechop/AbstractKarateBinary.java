package com.jc.kata.karatechop;

public abstract class AbstractKarateBinary implements Karate {

	public int chop(int value, int[] array) {
		int lowIndex = 0;
		int highIndex = array.length -1;
		int index;
		while(lowIndex <= highIndex) {
			index = getIndex(lowIndex, highIndex, value);
			if(array[index] == value) {
				return index;
			}
			else if(array[index] > value) {
				highIndex = index - 1;
			}
			else {
				lowIndex = index +1;
			}
		}
		return -1;
	}
	
	protected abstract int getIndex(int lowIndex, int highIndex, int value);

}
