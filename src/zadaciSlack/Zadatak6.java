package zadaciSlack;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji vodi evidenciju koliko puta je korisnik uneo svaku cifru od 0 do 5. Korisnik unosi N brojeva.
//		Program u sebi ima niz duzine 6 koji sluzi za evidenciju unetih cifara. Na kraju programa odstapmati evidenciju.
//		Primer izvrsenja:
//		Unesite N: 6
//		Unesite broj: 1
//		Unesite broj: 1
//		Unesite broj: 0
//		Unesite broj: 1
//		Unesite broj: 5
//		Unesite broj: 7
//		Evidencija:
//		0 se javila 1 puta
//		1 se javila 3 puta
//		2 se javila 0 puta
//		3 se javila 0 puta
//		4 se javila 0 puta
//		5 se javila 1 ptua
		
		
		ArrayList<Integer> brojac = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		
		for (int i = 0; i < 6; i++) {
			brojac.add(0);				// napravili smo niz duzine 6 za k = 6.
		}
		System.out.print("Unesite N: ");
		int n = s.nextInt();				//ovim odredjujemo koliko broja unosimo
		for (int i = 0; i < n; i++) { 
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			for (int j = 0; j < 6; j++) {
				if (broj == j) {
					brojac.set(j, brojac.get(j) + 1);
				}		
			} 
		}
		System.out.println("Evidencija: ");
		for (int j = 0; j < 6; j++) {
			System.out.println(j + " se javila " + brojac.get(j) + " puta.");
		
		}
		
		
	}

}
