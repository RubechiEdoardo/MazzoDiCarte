package it.edu.iisvolta;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exeption {
		Scanner s = new Scanner (System.in);
		System.out.println("Inserisci il tipo di mazzo...");
		String tipo= s.nextLine();
		Mazzo m= new Mazzo(tipo);
		Carta c;
		do {
			c=m.estraiCarta();
			System.out.println("Carta estratta: " + c.getValore()+ " di "+ c.getSeme());
		}while(c!=null);

		s.close();

	}	
}
