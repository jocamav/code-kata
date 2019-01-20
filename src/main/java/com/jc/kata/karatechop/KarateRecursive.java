package com.jc.kata.karatechop;

public class KarateRecursive implements Karate {

	public int chop(int value, int[] array) {
		return chopRecursive(value, array, 0, array.length-1);
	}
	
	public int chopRecursive(int value, int[] array, int leftIndex, int rightIndex) {
		if(leftIndex > rightIndex) {
			return -1;
		}
		int middle = (rightIndex + leftIndex)/2;
		if (value == array[middle]) {
			return middle;
		}
		else if(value > array[middle]) {
			return chopRecursive(value, array, middle+1, rightIndex);
		}
		return chopRecursive(value, array, leftIndex, middle-1);
	}
}
