package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public class FullHouse implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		boolean threeFlag = false;
		boolean twoFlag = false;
		for (int j = 0; j < rankMatrix.length; j++) {
			if (rankMatrix[j] == 3) {
				threeFlag = true;
			} else if (rankMatrix[j] == 2) {
				twoFlag = true;
			}
		}
		return twoFlag && threeFlag ? Category.FULL_HOUSE : executor.evaluate(rankMatrix, suitMatrix);
	}

}
