public class StringDisplay extends Display {
	String word;

	public StringDisplay(String word) {
		this.word = word;
	}

	public int getCols() {
		return word.length();
	}

	public int getRows() {
		return 1;
	}

	public String getRowText(int row) {
		if (row == 0)
			return word;

		else
			return null;

	}
}
