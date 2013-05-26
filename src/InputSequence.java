
public class InputSequence {

	private String value;
	private int position;
	
	public InputSequence(String value) {
		this.value = value;
	}
	
	public void moveHeadToNextSymbol() {
		position++;
	}
	
	public char getCurrentSymbol() {
		if (position < value.length()) {
			return value.charAt(position);
		} else {
			return '0';
		}
	}

	public boolean hasMoreSymbols() {
		return position == value.length()+1;
	}
	
}
