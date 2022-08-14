package d05_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji pronalazi 7 stepen broja 2. 
//		Izvrsenje:
//		2 na stepen 7 je 128
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj koji zelite da stepenujete: ");
		int broj = s.nextInt();
		System.out.print("Unesite stepen broja: ");
		int stepen = s.nextInt();
		int rezultat = 1;
		
		for (int i = 0; i < stepen; i++) {
			rezultat = rezultat * broj;
		}
		System.out.println(broj + " na stepen " + stepen + " je " + rezultat);
	}

}
