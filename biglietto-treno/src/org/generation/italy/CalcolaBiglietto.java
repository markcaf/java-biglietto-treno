package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		/*
		Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. 
		Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, secondo queste regole:
		il prezzo del biglietto è definito in base ai km (0.21 € al km)
		va applicato uno sconto del 20% per i minorenni
		va applicato uno sconto del 40% per gli over 65 
		
		BONUS1: i minori di 12 anni viaggiano gratis
		BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Inserisci il numero di chilometri da percorrere: ");
		int userKm = sc.nextInt();
		
		System.out.print("Inserisci l'età del passeggero: ");
		int userAge = sc.nextInt();
		
		sc.close();
		
		double ticketPrice = 0.21 * userKm;
		System.out.println("Il prezzo del biglietto è: €" + String.format("%.2f", ticketPrice));
		
		if (userAge < 18) {
			if (userAge < 12) {
				ticketPrice = 0;
				System.out.println("Ma i minori viaggiano gratis, il prezzo del biglietto è: €" + String.format("%.2f", ticketPrice));
			} else {
				ticketPrice = ticketPrice - (ticketPrice * 20) / 100;
				System.out.println("Sconto del 20% per i minorenni applicato, il prezzo del biglietto scontato è: €" + String.format("%.2f", ticketPrice));	
			}
			
		} else if (userAge >= 65) {
			ticketPrice = ticketPrice - (ticketPrice * 40) / 100;
			System.out.println("Sconto del 40% per over65 applicato, il prezzo del biglietto scontato è: €" + String.format("%.2f", ticketPrice));
		} 

	}

}
