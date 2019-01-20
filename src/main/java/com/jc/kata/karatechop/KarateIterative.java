package com.jc.kata.karatechop;

public class KarateIterative implements Karate {

	public int chop(int value, int[] array) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value) {
				return i;
			}
			else if(array[i] > value) {
				return -1;
			}
		}
		return -1;
	}

}
