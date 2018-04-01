package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class FourOfaKind implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		for (int j = 0; j < rankMatrix.length; j++) {
			if (rankMatrix[j] == 4) {
				return Category.FOUR_OF_A_KIND;
			}
		}
		return executor.evaluate(rankMatrix, suitMatrix);
	}

}
