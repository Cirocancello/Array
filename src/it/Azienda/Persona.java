package it.Azienda;

public class Persona {
	
	private int matricola;	
	private String nome;
	private String cognome;		
	
	public Persona(int matricola, String nome, String cognome ) {	
		
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		
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
	
	public int getMatricola() {
		return matricola;
	}
	
	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}
	
	
	public String comeStringa() {
		return matricola + " - " + nome + ", " + cognome;
	}


}
