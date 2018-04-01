package com.test.pocker.util;

import java.util.Random;

public class NumberGenerator {

	public static int randInt(int min, int max) {
		int randomNum = new Random().nextInt((max - min) + 1) + min;
		return randomNum;
	}
}
