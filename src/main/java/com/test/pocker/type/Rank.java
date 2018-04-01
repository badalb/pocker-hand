package com.test.pocker.type;

import java.util.Arrays;

public enum Rank {
	TWO("2", 0), THREE("3", 1), FOUR("4", 2), FIVE("5", 3), SIX("6", 4), SEVEN("7", 5), EIGHT("8", 6), NINE("9",
			7), TEN("T", 8), JACK("J", 9), QUEEN("Q", 10), KING("K", 11), ACE("A", 12);

	private String code;

	private int value;

	private Rank(final String code, final int value) {
		this.code = code;
		this.value = value;
	}

	public String getCode() {
		return code;
	}

	public int getValue() {
		return value;
	}

	public static Rank findByCode(final String code) {
		return Arrays.stream(values()).filter(value -> value.getCode().equals(code)).findFirst().orElse(null);
	}
}
