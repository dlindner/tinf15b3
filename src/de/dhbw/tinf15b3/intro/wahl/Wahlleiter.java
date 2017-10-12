package de.dhbw.tinf15b3.intro.wahl;

public class Wahlleiter {
	
	public Wahlleiter() {
		super();
	}
	
	public void meldeAn0(Partei partei) {
		System.out.println("Wahlleiter0: Sie sind zugelassen.");
	}
	
	public void meldeAn1(Piraten piraten) {
		System.out.println("Wahlleiter1: Ich kann ihren Anhang nicht öffnen.");
	}
	
	public void meldeAn2(Veganer veganer) {
		System.out.println("Wahlleiter2: Bitte kleben Sie ihren Antrag zusammen.");
	}
}
