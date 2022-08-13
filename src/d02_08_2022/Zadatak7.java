package d02_08_2022;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture.AsynchronousCompletionTask;

public class Zadatak7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	7.	Napisati program koji ucitava stranicu jednakostranicnog trougla sa tastature i ispisuje povrsinu i obim trougla. 
//		Koren iz tri neka bude konstanta 1.73
//		Primer izvrsenja programa:
//		Unesite stranicu trougla: 10
//		Povrsina je 43.25
//		Obim je 30
		
		Scanner s = new Scanner(System.in);
		System.out.print("Unesite stranicu jednakostranicnog trougla: ");
		int a = s.nextInt();
		double povrsina = a * a * 1.73 / 4;
		int obim = 3 * a;
		
		System.out.println("Povrsina je " + povrsina);
		System.out.println("Obim je " + obim);

	}

}
