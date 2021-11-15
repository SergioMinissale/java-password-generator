package org.generation.italy.security;

public class PasswordGenerator {

	public static void main(String[] args) {
		//dichiarazione
		String nome;
		String cognome;
		String colorePreferito;
		
		int numeroGiorno;
		int numeroMese;
		int numeroAnno;
		
		//assegnamento
		nome = "Sergio";
		cognome = "Minissale";
		colorePreferito = "Verde";
		
		numeroGiorno = 01;
		numeroMese = 03;
		numeroAnno = 1997;
		
		int sommaDataDiNascita = numeroGiorno + numeroMese + numeroAnno;
		
		//stampa a video
		System.out.println("La sua Password sara: " + nome + "-" + cognome + "-" + colorePreferito + "-" + sommaDataDiNascita );
		

	}

}
