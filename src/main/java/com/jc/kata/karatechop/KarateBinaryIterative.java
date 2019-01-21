package com.jc.kata.karatechop;

public class KarateBinaryIterative extends AbstractKarateBinary {

	@Override
	protected int getIndex(int lowIndex, int highIndex, int value) {
		return (highIndex +lowIndex)/2;
	}

}
