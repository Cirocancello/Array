package it.Azienda;

public class UsoAzienda {

	public static void main(String[] args) {
		
		// creo un nuovo capo
		Persona capo = new Persona("Ciro", "Cancello");
		
		// creo i dipendenti
		Persona[] dipendente = {
				new Persona("Giovanni", "Costantino"),
				new Persona("Franco", "Esposito"),
				new Persona("Rinaldi", "Alessandra")
		};	
		
		// creo una nuova azienda
		Azienda azienda = new Azienda("PulyBrill", capo, dipendente);		
		azienda.stampa();
		
		// creo una nuova azienda con il capo e i dipendenti
		Persona capo1 = new Persona("Giovanni", "Cancello");
		
		Persona[] dipendente1 = {
				new Persona("Anna", "Cancello"),
				new Persona("Angelo", "Costantino")
		};
		
		Azienda azienda1 = new Azienda("Pulideal", capo1, dipendente1);
		
		azienda1.stampa();
		
		Persona nuovoDipendente = new Persona("Luca", "Cancello");
		azienda.aggiungiDipendente(nuovoDipendente);
		
		azienda.stampa();
		
		Persona nuovoDipendente1 = new Persona("Nadia", "Rinaldi");
		azienda.aggiungiDipendente(nuovoDipendente1);
		azienda.stampa();
		
		
	}

}
