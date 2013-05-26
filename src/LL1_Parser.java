

public class LL1_Parser implements SequenceParser {

	private InputSequence inputSequence;

	@Override
	public void parse(String inputValue) {
		inputSequence = new InputSequence(inputValue);
		
		S();
		
		System.out.println();
		if(inputSequence.hasMoreSymbols()) {
			System.out.println("NE");
		} else {
			System.out.println("DA");
		}
	}
	
	/**
	 * S -> aAB | bBA
	 */
	private void S() {
		System.out.print("S");
		
		char currentSymbol = inputSequence.getCurrentSymbol();
		if(currentSymbol == 'a') {
			inputSequence.moveHeadToNextSymbol();
			A();
			B();
		} else if(currentSymbol == 'b') {
			inputSequence.moveHeadToNextSymbol();
			B();
			A();
		} else {
			sequenceIsNotInLanguage();
		}
	}
	
	/**
	 * A -> bC | a
	 */
	private void A() {
		System.out.print("A");
		
		char currentSymbol = inputSequence.getCurrentSymbol();
		if(currentSymbol == 'a') {
			inputSequence.moveHeadToNextSymbol();
		} else if(currentSymbol == 'b') {
			inputSequence.moveHeadToNextSymbol();
			C();
		} else {
			sequenceIsNotInLanguage();
		}
	}
	
	/**
	 * B -> ccSbc | ϵ
	 */
	private void B() {
		System.out.print("B");
		
		if(inputSequence.getCurrentSymbol() == 'c') {
			inputSequence.moveHeadToNextSymbol();
		} else {
			return;
		}
		
		if(inputSequence.getCurrentSymbol() == 'c') {
			inputSequence.moveHeadToNextSymbol();
			S();
		} else {
			sequenceIsNotInLanguage();
		}
		
		if(inputSequence.getCurrentSymbol() == 'b') {
			inputSequence.moveHeadToNextSymbol();
		} else {
			sequenceIsNotInLanguage();
		}
		
		if(inputSequence.getCurrentSymbol() == 'c') {
			inputSequence.moveHeadToNextSymbol();
		} else {
			sequenceIsNotInLanguage();
		}
	}
	
	/**
	 * C -> AA
	 */
	private void C() {
		System.out.print("C");
		
		A();
		A();
	}
	
	private void sequenceIsNotInLanguage() {
		System.out.println();
		System.out.println("NE");
		System.exit(1);
	}
	
}
