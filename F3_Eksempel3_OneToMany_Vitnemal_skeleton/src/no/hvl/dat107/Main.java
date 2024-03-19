package no.hvl.dat107;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		VitnemalDAO vitnemalDAO = new VitnemalDAO();
		
		//a) Søke opp vitnemålet til en gitt student.

		//Vitnemal vm = vitnemalDAO.hentVitnemalForStudent(123456);
//		System.out.println(vm.toString());
		
		
		//b) Søke opp karakteren til en gitt student i et gitt kurs.

		Karakter ka = vitnemalDAO.hentKarakterForStudentIEmne(234567, "DAT107");
		System.out.println(ka);
		
		//c) Registrere en ny karakter for en gitt student 
		//		når karakter ikke finnes fra før.
		
		vitnemalDAO.registrerKarakterForStudent(0, "DAT102", LocalDate.now(), "C");
		//d) Registrere en ny karakter for en gitt student
		//		når karakter finnes fra før. Samme metode som i sted.
		
		
		//"TEST"
//		List<Karakter> hmmm = vitnemalDAO.hentKarakterlisteForFerdige("DAT107");
//		hmmm.forEach(System.out::println);
	}
	
//	private static Scanner scanner = new Scanner(System.in);
//	private static void pauseOgSjekkDatabasen(String prompt) {
//		System.out.println(prompt);
//		System.out.println("Trykk \"ENTER\" for å fortsette ...");
//		scanner.nextLine();
//	}
	

}





