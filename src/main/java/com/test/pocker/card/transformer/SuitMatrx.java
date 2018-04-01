package com.test.pocker.card.transformer;

import java.util.List;

import com.test.pocker.card.Card;
import com.test.pocker.type.Suit;

public class SuitMatrx {
	public static int[] createSuitMatrix(List<Card> cards) {
		int[] suitMatrix = new int[Suit.values().length];
		cards.forEach(card -> {
			suitMatrix[card.getSuit().getValue()] = suitMatrix[card.getSuit().getValue()] + 1;
		});
		return suitMatrix;
	}
}
