import java.util.Scanner;


public class Parser {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputLine = sc.nextLine();
		
		SequenceParser parser = new LL1_Parser();
		parser.parse(inputLine);
	}

}
