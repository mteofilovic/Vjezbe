package ba.bitcamp.dreamteam;

public class FinalLanguage {

	public static void main(String[] args) {

		TextIO.readFile("src/ba/bitcamp/dreamteam/draw");
		
		while (!TextIO.eof()) {
			String s = TextIO.getln();
			String[] parts = s.split(" ");
			String part1 = parts[0];

			System.out.println(part1);
		}
		TextIO.readStandardInput();

	}

}
