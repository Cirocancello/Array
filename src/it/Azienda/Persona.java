package it.Azienda;

public class Persona {
	
	private static int nuovaMatricola = 1;	
	private int matricola;
	private String nome;
	private String cognome;		
	
	public Persona(String nome, String cognome ) {	
		
		this.matricola = nuovaMatricola;
		this.nome = nome;
		this.cognome = cognome;
		nuovaMatricola++;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		nome = nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public void setCognome(String cognome) {
		cognome = cognome;
	}
	
	
	public String comeStringa() {
		return matricola + " - " + nome + ", " + cognome;
	}


}
