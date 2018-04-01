package com.test.pocker.main;

import com.test.pocker.hand.Hand;

public class TestMainClass {

	public static void main(String[] args) {
		String[] cards = { "HA", "HK", "H2", "H4", "HT" };
		// String[] cards = { "SA", "HA", "C2", "CA", "C5" };
		// String[] cards = { "S2", "D5", "C7", "ST", "HA" };

		Hand hand = new Hand(cards);

		hand.printCards();
		hand.printHandType();
	}
}
