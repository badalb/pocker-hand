package com.test.pocker.hand;

import java.util.ArrayList;
import java.util.List;

import com.test.pocker.card.Card;
import com.test.pocker.card.transformer.CodeToCard;
import com.test.pocker.card.transformer.RankMatrix;
import com.test.pocker.card.transformer.SuitMatrx;
import com.test.pocker.hand.evaluator.EvaluatorChain;
import com.test.pocker.hand.evaluator.EvaluatorChainImpl;

public class Hand {

	private final List<Card> cards;
	private final EvaluatorChain chain;

	public Hand(List<Card> cards) {
		this.cards = cards;
		chain = new EvaluatorChainImpl();
	}

	public Hand(String[] cards) {
		List<Card> cardList = new ArrayList<>();
		for (int i = 0; i < cards.length; i++) {
			cardList.add(CodeToCard.getCard(cards[i]));
		}
		this.cards = cardList;
		chain = new EvaluatorChainImpl();
	}
	
	public EvaluatorChain getEvaluators(){
		return this.chain;
	}
	
	public void printCards() {
		cards.forEach(card -> {
			System.out.println("Suite:" + card.getSuit() + " Rank:" + card.getRank());
		});
	}

	public void printHandType() {
		System.out.println(chain.execute(RankMatrix.createRankMatrix(cards), SuitMatrx.createSuitMatrix(cards)));
	}

}
