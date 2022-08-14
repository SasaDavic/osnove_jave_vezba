package d08_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		.Zadatak (ZA VEZBANJE)
//		Napisati program koji od korisnika ucitava stanje na racunu a zatim sa racuna skida 
//		dok god ima sredstava za transakciju. U slucaju da nema dovoljno sredstava ispisati odgovarajucu gresku.
//		Primer izvrsenja:
//		Unesite stanje na racunu: 100
//		Na racunu imate $100, Unesite sumu za sledecu transakciju: 50
//		Na racunu imate $50, Unesite sumu za sledecu transakciju: 31
//		Na racunu imate $19, Unesite sumu za sledecu transakciju: 20
//		Nemate dovoljno sredstava na racunu.Na racunu vam je ostalo $19
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite stanje na racunu: ");
		int stanje = s.nextInt();
		boolean racun = true;
		while (racun == true) {
			System.out.print("Na racunu imate $" + stanje +", Unesite sumu za sledecu transakciju: ");
			int transakcija = s.nextInt();			
			if (transakcija > stanje) {
				racun = false;
				System.out.println("Nemate dovoljno sredstava na racunu. Na racunu vam je ostalo $" + stanje);
			} else {
				stanje = stanje - transakcija;				
			}
		}

	}}
