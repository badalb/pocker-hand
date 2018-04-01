package com.test.pocker.card.transformer;

import java.util.List;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;

public class RankMatrix {
	public static int[] createRankMatrix(List<Card> cards) {
		int[] suitMatrix = new int[Rank.values().length];
		cards.forEach(card -> {
			suitMatrix[card.getRank().getValue()] = suitMatrix[card.getRank().getValue()] + 1;
		});
		return suitMatrix;
	}
}
