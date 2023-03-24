package it.edu.iisvolta;

import java.util.ArrayList;
import java.util.Random;

public class Mazzo {
	
		private String tipologia;
		private ArrayList <Carta> elencoCarte = new ArrayList<>();
		private String [] semeNapoletane = {"Bastoni","Coppe","Denari", "Spade"};
		private String [] semeFrancesi = {"Fiori","Picche","Quadri", "Cuori"};
		
		public Mazzo (String tipologia) throws Exception {
			this.tipologia = tipologia;
			switch (tipologia) {
				case "napoletane":
					for (int seme=1;seme<=4;seme++) {
						for (int valore=1;valore<=10;valore++) {
							Carta c=new Carta (valore, "semeNapoletane"); //inizializzo la variabile per creare la carta
							elencoCarte.add(c); // aggiungo la carta all'elenco(array)
						}						
					}
					break;
				case "francesi":
					for (int seme=1;seme<=4;seme++) {
						for (int valore=1;valore<=13;valore++) {
							Carta c=new Carta (valore,"semeFrancesi"); //inizializzo la variabile per creare la carta
							elencoCarte.add(c); // aggiungo la carta all'elenco(array)
						}						
					}
					break;
				default: 
					throw new Exception("Tipo di mazzo non valido"); //creo l'allarme nel programma					
			}				
		}
		
		public Carta estraiCarta () {//Si utilizza il get con un array in modo da andare nella posizione indicata
			Random r= new Random();
			int pos;
			do {
				pos=r.nextInt(elencoCarte.size());
			}while (elencoCarte.get(pos).isEstratta());
			elencoCarte.get(pos).setEstratta(true);
			return elencoCarte.get(pos);
		}			
}



