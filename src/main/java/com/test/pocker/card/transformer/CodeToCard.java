package com.test.pocker.card.transformer;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class CodeToCard {

	public static Card getCard(String code) {
		String suitCode = code.substring(0, 1);
		String rankCode = code.substring(1);
		Card card = new Card(Rank.findByCode(rankCode), Suit.findByCode(suitCode));
		return card;
	}
}
