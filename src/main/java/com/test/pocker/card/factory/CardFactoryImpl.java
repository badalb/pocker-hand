package com.test.pocker.card.factory;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class CardFactoryImpl implements CardFactory {

	@Override
	public Card getCards(Suit suit, Rank rank) {
		return new Card(rank, suit);
	}
}
