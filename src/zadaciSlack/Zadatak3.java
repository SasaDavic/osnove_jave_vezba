package zadaciSlack;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji simulira navijanje alarma
//		Korisnik unosi sa tastature vreme koje zeli
//		unosi se sat - smatrajte da korisnik unosi od 0 do 23
//		Unosi se minut - smatrajte da korisnik unosi od 0 do 59
//		Program zatim ispisuje kada ce zvoniti alarm. Alarm zvoni narednih pola sata, na svakih 5min
//		Primer izvrsenja:
//		Unesite sat: 18
//		Unesite minut: 43
//		Alarm:
//		18:43
//		18:48
//		18:53
//		18:58
//		19:3
//		19:8
//		19:13
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite sat (0-23): ");
		int sat = s.nextInt();
		System.out.print("Unesite minut (0-59): ");
		int minut = s.nextInt();
		System.out.println("Alarm: ");
		for (int i = 0; i <= 6; i++) {
			if (minut < 60 && sat < 24) {
				System.out.println(sat + ":" + minut);
				minut = minut + 5;
			} else if (minut >= 60 && sat < 23) {
				minut = minut - 60;
				sat = sat + 1;
				System.out.println(sat + ":" + minut);	
				minut = minut + 5;				
			} else if (minut >= 60 && sat == 23) {
				minut = minut - 60;
				sat = sat + 1 - 24;
				System.out.println(sat + ":" + minut);
				minut = minut + 5;
			} 
			
		}
	}

}
