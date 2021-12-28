package it.Azienda;

public class UsoAzienda {

	public static void main(String[] args) {
		
		// creo un nuovo capo
		Persona capo = new Persona(1, "Ciro", "Cancello");
		
		// creo i dipendenti
		Persona[] dipendente = {
				new Persona(2,"Giovanni", "Costantino"),
				new Persona(3,"Franco", "Esposito"),
				new Persona(4,"Rinaldi", "Alessandra")
		};	
		
		// creo una nuova azienda
		Azienda azienda = new Azienda("PulyBrill", capo, dipendente);		
		azienda.stampa();
		
		// creo una nuova azienda con il capo e i dipendenti
		Persona capo1 = new Persona(1,"Giovanni", "Cancello");
		
		Persona[] dipendente1 = {
				new Persona(2, "Anna", "Cancello"),
				new Persona(3, "Angelo", "Costantino")
		};
		
		Azienda azienda1 = new Azienda("Pulideal", capo1, dipendente1);
		
		azienda1.stampa();
		
		Persona nuovoDipendente = new Persona(5,"Luca", "Cancello");
		azienda.aggiungiDipendente(nuovoDipendente);
		
		azienda.stampa();
		
		Persona nuovoDipendente1 = new Persona(6,"Nadia", "Rinaldi");
		azienda.aggiungiDipendente(nuovoDipendente1);
		azienda.stampa();
		
		
	}

}
