# Simple Pocker Hand Evaluator
This simple codebase demonestrates object design for Pocker Hand evaluation for given five cards.

## Execution
The Application can be executed by executing the MainClass or TestMainClass. TestMainClass requires us to provide 
input like { "HA", "HK", "H2", "H4", "HT" }/{ "SA", "HA", "C2", "CA", "C5" } of course it could be any :), here S,H,D,C denotes the suit type and 2,3, T,J,Q,K,A denotes rank.

## Key Components
The Application uses Category, Rank and Suit as types.
A Card is a composition of Rank and Suit. Deck uses a Deck Builder to build a Deck of Cards.
Deck Builder uses Card Factory to create a Deck of Cards for all Suits and Ranks (so 52 cards in all). 
Deck has a draw card method which takes no of Cards we want to draw from Deck to form a Hand.

We can form a Hand which has a list of Cards drwaing cards from Deck (Random cards are selected).

Pocker hand type Evaluator has a chain of different type of Hand Evaluator like FLUSH, FOUR of a KIND, PAIR etc.
We can add a new Evalutor implementing Evalutor interface.

public class EvaluatorImpl implements Evaluator {

	private Evaluator executor;

	@Override
	public void setNextEvaluator(Evaluator evaluate) {
		executor = evaluate;
	}

	@Override
	public Category evaluate(int[] rankMatrix, int[] suitMatrix) {
		for (int i = 0; i < suitMatrix.length; i++) {
			if (suitMatrix[i] == 5) {
				return Category.FLUSH;
			}
		}
		return executor.evaluate(rankMatrix, suitMatrix);
	}
}

A new Evalutor can be appended/removed to the chain using chain implementations add/remove method.

public interface EvaluatorChain {

	public void add(Evaluator evaluator);

	public void remove(Evaluator evaluator);

	public Category execute(int[] createRankMatrix, int[] createSuitMatrix);
}
