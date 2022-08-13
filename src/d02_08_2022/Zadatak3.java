package d02_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	3. (Za vezbanje)Napisati program koji cuva i stampa podatke jednog bug reporta. 
//		 Bug je onaj koji ste radili na manuelnom delu
//		 “Aplikacija: Viber
//		Opis problema: Ne uspevam sliku da posaljem, izadje mi greska. 
//		Probao sam sliku koju imam u telefonu sacuvanu da pošaljem.
//		Zadatak: Proveriti slucaj koji je korisnik prijavio (zamislite da slanje slike zaista ne radi) 
//		i sastavite bug report.”. 
//		Bug report od informacija ima:
//		ID (broj)
//		Title
//		Severity
//		Priority
//		Description
//		Environment
//		Steps to reproduce (jedna promenlijva)
//		Expected result
//		Actual result
//		Imate slobodu da stampate podatke kako vam se najvise svidja.
		
		String id = "#1005";
		String title = "Viber - nemoguce slanje slike.";
		String desc = "Aplikacija pokazuje gresku kada kliknemo na dugme send.";
		String enviroment = "Mobilna aplikacija, Viber - Version 17.6.0.15";
		String steps = "Otvorimo Viber aplikaciju, izaberemo sliku iz galerije, kliknemo na dugme send.";
		String eR = "Slika bi trebalo da bude poslata";
		String aR = "Pojavljuje se greska: Oops, something went wrong.";
		String severity = "High";
		String priority = "High";
		String assign = "Sasa Davic";
		
		System.out.println("Bug report");
		System.out.println("ID: " + id);
		System.out.println("Title: " + title);
		System.out.println("Description: " + desc);
		System.out.println("Environment: " + enviroment);
		System.out.println("Steps to Reproduce: " + steps);
		System.out.println("Expected Result: " + eR);
		System.out.println("Actual Result: " + aR);
		System.out.println("Severity: " + severity);
		System.out.println("Priority: " + priority);
		System.out.println("Assigned to: " + assign);
		
		

	}

}
