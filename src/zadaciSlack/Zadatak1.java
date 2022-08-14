package zadaciSlack;

import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program koji ucitava tri jednocifrena broja a,
//		b i c  i racuna vrednost x tako sto od unetih brojeva formira jedan trocifren broj. 
//		Promenljive a,b,c i x su celobrojne vrednosti.
//		Primer izvrsenja:
//		Unesite a: 3
//		Unesite b: 5
//		Unesite c: 9
//		Vrednost za x je 359
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite a: ");
		int a = s.nextInt();
		System.out.print("Unesite b: ");
		int b = s.nextInt();
		System.out.print("Unesite c: ");
		int c = s.nextInt();
		String x = " " + a + b + c;
		System.out.println("Vrednost za x je" + x);
		
		
	}

}
