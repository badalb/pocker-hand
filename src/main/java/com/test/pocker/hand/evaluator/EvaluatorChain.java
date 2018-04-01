package com.test.pocker.hand.evaluator;

import com.test.pocker.type.Category;

public interface EvaluatorChain {

	public void add(Evaluator evaluator);

	public void remove(Evaluator evaluator);

	public Category execute(int[] createRankMatrix, int[] createSuitMatrix);
}
