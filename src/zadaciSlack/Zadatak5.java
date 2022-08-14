package zadaciSlack;

import java.util.ArrayList;

public class Zadatak5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Napisati program za potrebe 2x2 pasta bara. Potrebe programa su da stampamo meni.
//		Program u sebi ima dva niza podataka:
//		Prvi niz je niz pasti koje pasta bar nudi
//		Drugi niz je niz cena
//		Proizvod iz prvog niza je uskladjen sa cenom iz drugog niza po poziciji, 
//		sto znaci da pasta sa pozicije 0 je sa cenom sa pozicije 0... pasta za pozicije 2 je sa cenom sa pozicije 2...
//		Nizovi su proizvoljni.
//		Primer izvrsenja:
//		AGLIO E OLIO..................................320 rsd
//		FUNGHI..................................320 rsd
//		PESTO..................................310 rsd
//		NAPOLITANA..................................280 rsd
//		ARRABBIATA..................................300 rsd
		
		ArrayList<String> pasta = new ArrayList<String>();
		pasta.add("AGLIO E OLIO");
		pasta.add("FUNGHI");
		pasta.add("PESTO");
		pasta.add("NAPOLITANA");
		pasta.add("ARRABBIATA");
		
		ArrayList<Integer> cena = new ArrayList<Integer>();
		cena.add(320);
		cena.add(320);
		cena.add(310);
		cena.add(280);
		cena.add(300);
		
		for (int i = 0; i < 5; i++) {
			System.out.println(pasta.get(i) + ".................................." + cena.get(i) + " rsd");			
		}
		
	}

}
