package d08_08_2022;

import java.util.Random;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		(Za vezbanje) Napisati program za ucenje matematike. Program daje korisniku matematicke zadatke sve dok ne pogresi. 
//		Svaki nivo predstavlja jednu iteraciju petlje i u svakom nivou korisniku se prikazuju dva random broja 
//		koja treba da sabere. (Program generise random brojeve u opsegu od 0 do 100, ne unosi ih korisnik)
//		Random brojevi u Javi se generisisu kao u primeru
//		// creating an object of Random class   
//		Random random = new Random();   
//		// Generates random integers 0 to 49  
//		int x = random.nextInt(50);  
//		Koristan link, koristan video
//
//		Primer izvrsenja:
//		Nivo 1: Koliko je 1 + 4: 5
//		Cestitam!
//		Nivo 2: Koliko je 3 + 34: 37
//		Cestitam!
//		Nivo 3: Koliko je 23 + 12: 1223
//		Game Over!
		
		Scanner s = new Scanner(System.in);
		Random random = new Random();
		int nivo = 1;
		boolean tacno = true;
		while (tacno == true) {
			int x = random.nextInt(101);
			int y = random.nextInt(101);
			System.out.print("Nivo " + nivo + ": ");
			System.out.print("Koliko je " + x + " + " + y + ":");
			int rezultat = s.nextInt();
			if (x + y == rezultat) {
				System.out.println("Cestitam!");
				nivo++;
			} else {
				System.out.println("Game Over!");
				tacno = false;
			}
			
		}
		
	}

}
