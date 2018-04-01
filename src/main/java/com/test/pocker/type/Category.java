package com.test.pocker.type;

public enum Category {
	FOUR_OF_A_KIND("Four of a kind"), FULL_HOUSE("Full house"), FLUSH("Flush"), STRAIGHT("Straight"), THREE_OF_A_KIND(
			"Three of a kind"), PAIR("Pair"), HIGH_CARD("High Card");

	private String description;

	private Category(final String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}
}