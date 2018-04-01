package com.test.pocker.deck;

import java.util.ArrayList;
import java.util.List;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class DeckBuilderImpl implements DeckBuilder {

	@Override
	public List<Card> build() {
		List<Card> cards = new ArrayList<>();
		for (Suit suit : Suit.values()) {
			for (Rank r : Rank.values()) {
				Card card = new Card(r, suit);
				cards.add(card);
			}
		}
		return cards;
	}
}
