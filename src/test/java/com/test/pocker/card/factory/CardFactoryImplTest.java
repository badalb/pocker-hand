package com.test.pocker.card.factory;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class CardFactoryImplTest {

	private CardFactory cardFactory;

	@Before
	public void setUp() throws Exception {
		cardFactory = new CardFactoryImpl();
	}

	@After
	public void tearDown() throws Exception {
		cardFactory = null;
	}

	@Test
	public void testGetCards() {
		Card card = cardFactory.getCards(Suit.SPADES, Rank.ACE);
		assertNotNull(card);
		assertTrue(card.getSuit().equals(Suit.SPADES));
		assertTrue(card.getRank().equals(Rank.ACE));
	}

}
