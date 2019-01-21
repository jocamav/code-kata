package com.jc.kata.karatechop;

import java.util.Arrays;

public class KarateJavaBinarySearch implements Karate {

	public int chop(int value, int[] array) {
		int result = Arrays.binarySearch(array, value);
		if(result < 0 ) {
			result = -1;
		}
		return result;
	}

}
