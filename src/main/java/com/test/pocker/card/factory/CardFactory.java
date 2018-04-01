package com.test.pocker.card.factory;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public interface CardFactory {

	public Card getCards(Suit suit, Rank rank);
}
