package com.jc.kata.karatechop;

import java.util.concurrent.ThreadLocalRandom;

public class KarateRandomSearch extends AbstractKarateBinary {
	
	@Override
	protected int getIndex(int lowIndex, int highIndex, int value, int[] array) {
		return ThreadLocalRandom.current().nextInt(lowIndex, highIndex + 1);
	}

}
