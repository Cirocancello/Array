package it.Azienda;

import java.util.Arrays;


public class Azienda {
	
		private String nome; // nome dell' azienda
		private Persona capo; // capo dell'azienda
		
		private Persona[] dipendente; // dipendenti

		public Azienda(String nome, Persona capo, Persona[] dipendente) {		
			this.nome = nome;
			this.capo = capo;
			this.dipendente = dipendente;
		}

		public void stampa() {
			System.out.println("Azienda : " + nome);
			System.out.println("Capo : " + capo.comeStringa());			
			System.out.println("Dipendenti : ");
			
			for(Persona d : dipendente) {
			   System.out.println("\t " + d.comeStringa());
		    }	
		}

		public void aggiungiDipendente(Persona nuovoDipendente) {
//			Persona[] nuovo = new Persona[dipendente.length +1];
//			
//			for(int i=0;i<dipendente.length; ++i) {
//				nuovo[i] = dipendente[i];
//			}
//			nuovo[dipendente.length] = nuovoDipendente;
//			dipendente = nuovo;
			
			Persona[] nuovi = Arrays.copyOf(dipendente, dipendente.length + 1);
			nuovi[dipendente.length] = nuovoDipendente;
			
			dipendente = nuovi;
		 }

}
