package ba.vjezbe;

import java.util.Arrays;

public class Task3 {

	public static String[] getNames() {
		int counter = 0;

		TextIO.readFile("src/ba/vjezbe/names.in");
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}
		TextIO.readStandardInput();
		TextIO.readFile("src/ba/vjezbe/names.in");
		String[] s = new String[counter];
		if (!TextIO.eof()) {
			for (int i = 0; i < s.length; i++) {
				s[i] = TextIO.getln();
				System.out.println(s[i]);
			}

		}
		return s;
	}

	public static String[] getSubject() {
		int counter = 0;

		TextIO.readFile("src/ba/vjezbe/courses.in");
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}
		TextIO.readStandardInput();
		TextIO.readFile("src/ba/vjezbe/courses.in");
		String[] s = new String[counter];
		if (!TextIO.eof()) {
			for (int i = 0; i < s.length; i++) {
				s[i] = TextIO.getln();
				System.out.print(s[i]+" ");
			}

		}
		return s;
	}

	public static String[] getGrades() {
		int counter = 0;

		TextIO.readFile("src/ba/vjezbe/grades.in");
		while (!TextIO.eof()) {
			TextIO.getln();
			counter++;
		}
		System.out.println(counter);
		TextIO.readStandardInput();
		TextIO.readFile("src/ba/vjezbe/grades.in");
		String[] s = new String[counter];
		if (!TextIO.eof()) {
			for (int i = 0; i < s.length; i++) {
				s[i] = TextIO.getln();
				System.out.println(s[i] + " ");
			}
			System.out.println();

		}
		return s;

	}
	
	

	public static void main(String[] args) {
		TextIO.readFile("src/ba/vjezbe/sve.txt");
		
		TextIO.writeFile("src/ba/vjezbe/sve.txt");
		TextIO.putln(Arrays.toString(getSubject()));		
		TextIO.putln(Arrays.toString(getNames()));		
		TextIO.putln(Arrays.toString(getGrades()));
//		gradesAndCourses();
		
		
		
		
		
	}

}
