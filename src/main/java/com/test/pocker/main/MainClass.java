package com.test.pocker.main;

import com.test.pocker.deck.Deck;
import com.test.pocker.hand.Hand;

public class MainClass {

	public static void main(String[] args) {
		Deck deck = new Deck();
		Hand hand = new Hand(deck.drawCard(5));

		hand.printCards();
		hand.printHandType();
	}
}
