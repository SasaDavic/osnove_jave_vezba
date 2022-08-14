package zadaciSlack;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Evo jos jednog za vezbanje
//		Napisati program za potrebe jutjuba koji odredjuje kada ce se pokrenuti reklame.
//		Duzinu videa kao i vreme prve reklame unosi korisnik a zatim se na svakih 30s startuje nova reklama.
//		Primer izvrsenja:
//		Duzina videa (minut): 2
//		Duzina videa (sekund): 40
//		Prva reklama (minut): 0
//		Prva reklama (sekund): 15
//		Reklame:
//		0:15
//		0:45
//		1:15
//		1:45
//		2:15 (edited) 
		
		Scanner s = new Scanner(System.in);
		System.out.print("Duzina videa (minut): ");
		int videoM = s.nextInt();
		System.out.print("Duzina videa (sekund): ");
		int videoS = s.nextInt();
		System.out.print("Duzina reklama (minut): ");
		int reklamaM = s.nextInt();
		System.out.print("Duzina reklama (sekund): ");
		int reklamaS = s.nextInt();
		int ukupnoSekundiV = videoS + 60 * videoM;
		int ukupnoSekundiR = reklamaS + 60 * reklamaM;
		
		System.out.println("Reklame:");
		while (ukupnoSekundiR <= ukupnoSekundiV) {
			System.out.println(reklamaM + ":" + reklamaS);
			reklamaS = reklamaS + 30;
			ukupnoSekundiR = ukupnoSekundiR + 30;
			if (reklamaS >= 60) {
				reklamaS = reklamaS - 60;
				reklamaM = reklamaM + 1;
			}
		}
	}

}
