package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class EvaluatorChainImpl implements EvaluatorChain {

	private Evaluator firstEvaluator;

	public EvaluatorChainImpl() {
		firstEvaluator = prepare();
	}

	private Evaluator prepare() {
		Evaluator flush = new Flush();
		Evaluator fourOfaKind = new FourOfaKind();
		flush.setNextEvaluator(fourOfaKind);
		Evaluator fullHouse = new FullHouse();
		fourOfaKind.setNextEvaluator(fullHouse);
		Evaluator straight = new Straight();
		fullHouse.setNextEvaluator(straight);
		Evaluator threeOfaKind = new ThreeOfaKind();
		straight.setNextEvaluator(threeOfaKind);
		Evaluator pair = new Pair();
		threeOfaKind.setNextEvaluator(pair);
		Evaluator high = new HighCard();
		pair.setNextEvaluator(high);
		return flush;
	}

	@Override
	public void add(Evaluator evaluator) {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove(Evaluator evaluator) {
		// TODO Auto-generated method stub

	}

	@Override
	public Category execute(int[] rankMatrix, int[] suitMatrix) {
		return firstEvaluator.evaluate(rankMatrix, suitMatrix);
	}

}
