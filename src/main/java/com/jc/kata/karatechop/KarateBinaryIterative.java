package com.jc.kata.karatechop;

public class KarateBinaryIterative extends AbstractKarateBinary {

	@Override
	protected int getIndex(int lowIndex, int highIndex, int value, int[] array) {
		return (highIndex +lowIndex)/2;
	}

}
