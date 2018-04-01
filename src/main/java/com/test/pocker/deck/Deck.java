package com.test.pocker.deck;

import java.util.ArrayList;
import java.util.List;

import com.test.pocker.card.Card;
import com.test.pocker.util.NumberGenerator;

public class Deck {

	private List<Card> cards;
	private DeckBuilder deckBuilder;

	public Deck() {
		deckBuilder = new DeckBuilderImpl();
		cards = deckBuilder.build();
	}

	public List<Card> drawCard(int numCards) {
		List<Card> result = new ArrayList<>();
		for (int i = 0; i < numCards; i++) {
			result.add(cards.get(NumberGenerator.randInt(0, 51)));
		}
		return result;
	}

}
