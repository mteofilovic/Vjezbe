package ba.predavanja;

public class Test {

//	public static void getOlderPerson(String[] g1, String[] g2) {
//		if (Integer.parseInt(g1[2])>Integer.parseInt(g2[2])) {
//			print(g2);
//		}else 
//			print(g1);
//	}
	
//	public static void getOlderPerson(Person g1, Person g2) {
//		if (g1.yearOfBirth>g2.yearOfBirth) {
//			print(g2);
//		}else 
//			print(g1);
//	}
	
	public static void getAgeDiff(Person g1, Person g2){
		Integer ageDiff;
		if (g1.yearOfBirth>g2.yearOfBirth) {
	ageDiff=g1.yearOfBirth-g2.yearOfBirth;
			bitPrint(g2, g1, ageDiff);
			
		}else 
			ageDiff=g2.yearOfBirth-g1.yearOfBirth;
			bitPrint(g1, g2, ageDiff);
			
	}
			
	public static void bitPrint (Person g1, Person g2, Integer ageDifference) {
		System.out.printf("Osoba,%s s%, rodjena %d, koja zivi u %s, razlika %d", g1.name,g1.lName,g1.yearOfBirth,g1.Adress,ageDifference);
	}

	
	
//	public static void print(Person print, Integer ageDifference) {
//		
//		System.out.println( "Older person is:");
//		System.out.println("Ime: "+print.name);
//		System.out.println("Prezime: "+print.lName);
//		System.out.println("Godina rodjenja: "+print.yearOfBirth);
//		System.out.println("Ulica: "+print.Adress);
//		System.out.println("Broj licne: "+print.personID);
//		System.out.println("Razlika u godinama je: "+ageDifference);
//		
//		
//	}
	}

