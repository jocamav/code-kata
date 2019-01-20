package com.jc.kata.karatechop;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class KarateChopTest {

	private static int[] EMPTY_ARRAY;
	private static int[] ONE_ITEM_ARRAY;
	private static int[] THREE_ITEM_ARRAY;
	private static int[] FOUR_ITEM_ARRAY;
	private static int[] HUNDRED_ITEM_ARRAY;
	private static int[] THOUSAND_ITEM_ARRAY;
	
	@BeforeClass
	public static void initArrays() {
		EMPTY_ARRAY = getOddArray(0);
		ONE_ITEM_ARRAY = getOddArray(1);
		THREE_ITEM_ARRAY = getOddArray(3) ;
		FOUR_ITEM_ARRAY = getOddArray(4);
		HUNDRED_ITEM_ARRAY = getOddArray(100);
		THOUSAND_ITEM_ARRAY = getOddArray(1000);
	}
	
	private static int[] getOddArray(int size) {
		int[] array = new int[size];
		for(int i = 0; i < size; i++) {
			array[i] = (i*2)+1;
		}
		return array;
	}

	@Test
	public void testKarateIterative() {
		Karate karate = new KarateIterative();
		testChopWithArrays(karate);
	}
	
	@Test
	public void testKarateRecursive() {
		Karate karate = new KarateRecursive();
		testChopWithArrays(karate);
	}
	
	public void testChopWithArrays(Karate karate) {
		assertEquals("Check value", -1, karate.chop(3,EMPTY_ARRAY));
		assertEquals("Check value", -1, karate.chop(3,ONE_ITEM_ARRAY));
		assertEquals("Check value", 0, karate.chop(1,ONE_ITEM_ARRAY));
		
		assertEquals("Check value", 0, karate.chop(1,THREE_ITEM_ARRAY));
		assertEquals("Check value", 1, karate.chop(3,THREE_ITEM_ARRAY));
		assertEquals("Check value", 2, karate.chop(5,THREE_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(0,THREE_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(2,THREE_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(4,THREE_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(6,THREE_ITEM_ARRAY));

		assertEquals("Check value", 0, karate.chop(1,FOUR_ITEM_ARRAY));
		assertEquals("Check value", 1, karate.chop(3,FOUR_ITEM_ARRAY));
		assertEquals("Check value", 2, karate.chop(5,FOUR_ITEM_ARRAY));
		assertEquals("Check value", 3, karate.chop(7,FOUR_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(0,FOUR_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(2,FOUR_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(4,FOUR_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(6,FOUR_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(8,FOUR_ITEM_ARRAY));

		assertEquals("Check value", 0, karate.chop(1,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 1, karate.chop(3,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 4, karate.chop(9,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 24, karate.chop(49,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 28, karate.chop(57,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 34, karate.chop(69,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 40, karate.chop(81,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 46, karate.chop(93,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 49, karate.chop(99,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 53, karate.chop(107,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 63, karate.chop(127,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 75, karate.chop(151,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 91, karate.chop(183,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 95, karate.chop(191,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", 99, karate.chop(199,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(0,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(20,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(40,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(60,HUNDRED_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(100,HUNDRED_ITEM_ARRAY));
		
		assertEquals("Check value", 0, karate.chop(1,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 1, karate.chop(3,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 4, karate.chop(9,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 24, karate.chop(49,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 28, karate.chop(57,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 34, karate.chop(69,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 40, karate.chop(81,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 46, karate.chop(93,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 49, karate.chop(99,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 53, karate.chop(107,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 63, karate.chop(127,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 75, karate.chop(151,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 91, karate.chop(183,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 95, karate.chop(191,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 99, karate.chop(199,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 250, karate.chop(501,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 300, karate.chop(601,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 350, karate.chop(701,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 450, karate.chop(901,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 499, karate.chop(999,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 500, karate.chop(1001,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 750, karate.chop(1501,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 950, karate.chop(1901,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", 999, karate.chop(1999,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(2,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(100,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(1000,THOUSAND_ITEM_ARRAY));
		assertEquals("Check value", -1, karate.chop(2000,THOUSAND_ITEM_ARRAY));
	}

}
