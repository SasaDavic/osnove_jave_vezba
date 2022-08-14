package d08_08_2022;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji ucitava N brojeva od korisnika i sabira samo trocifrene brojeve. 
//		Zadatak resiti while petljom.
//		Unesite N: 5
//		Unesite broj: 1
//		Unesite broj: 32
//		Unesite broj: 121
//		Unesite broj: 1333
//		Unesite broj: 144
//		Suma je: 265
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite N: ");
		int n = s.nextInt();
		int brojac = 0;
		int suma = 0;
		while (brojac < n) {
			System.out.print("Unesite broj: ");
			int broj = s.nextInt();
			if (broj > 99 && broj <1000) {
				suma = suma + broj;
			}
			brojac++;
		}
		System.out.println("Suma je: " + suma);
	}

}
