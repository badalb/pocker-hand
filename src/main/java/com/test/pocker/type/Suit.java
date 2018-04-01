package com.test.pocker.type;

import java.util.Arrays;

public enum Suit {
	SPADES("S", 0), HEARTS("H", 1), DIAMONDS("D", 2), CLUBS("C", 3);
	private String code;
	private int value;

	private Suit(final String code, final int value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public int getValue() {
		return value;
	}

	public static Suit findByCode(final String code) {
		return Arrays.stream(values()).filter(value -> value.getCode().equals(code)).findFirst().orElse(null);
	}
}
