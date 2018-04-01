package com.test.pocker.card.transformer;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.test.pocker.card.Card;
import com.test.pocker.type.Rank;
import com.test.pocker.type.Suit;

public class CodeToCardTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetCard() {
		String code = "H5";
		Card convertedCard = CodeToCard.getCard(code);
		assertTrue(convertedCard.getSuit().equals(Suit.HEARTS));
		assertTrue(convertedCard.getRank().equals(Rank.FIVE));
	}

}
