package com.test.pocker.deck;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.card.Card;

public class DeckTest {

	private Deck deck;

	@Before
	public void setUp() throws Exception {
		deck = new Deck();
	}

	@After
	public void tearDown() throws Exception {
		deck = null;
	}

	@Test
	public void testDrawCard() {
		List<Card> cards = deck.drawCard(5);
		assertNotNull(cards);
		assertTrue(cards.size() == 5);
		cards.forEach(card -> {
			System.out.println("Suite: " + card.getSuit() + "   Rank: " + card.getRank());
		});
	}
}
