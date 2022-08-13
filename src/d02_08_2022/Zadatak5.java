package d02_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		5. Napisati program koj racuna z prema formuli: (x - y) na kvadrat.
//		X i Y se unose sa tastature.
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Unesite x: ");
		int x = s.nextInt();
		System.out.print("Unesite y: ");
		int y = s.nextInt();
		
		int z = (x - y)*(x - y);
		System.out.println("Kvadrat razlike broja x i y je: " + z);
		
	}

}
