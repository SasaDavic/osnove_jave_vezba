package d05_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	5.	Napisati program koji od korisnika ucitava N jednocifrenih 
//		brojeva i od njih formira rezultujuci broj kao na primeru
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 2
//		Unesite broj: 0
//		Unesite broj: 4
//		Unesite broj: 1
//		Rezultujuci broj je 12041
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		String rezultat = " ";
		
		for (int i = 0; i < n; i++) {
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			rezultat = rezultat + broj;
		}
		System.out.println("Rezultujuci broj je" + rezultat);
		
		
	}

}
