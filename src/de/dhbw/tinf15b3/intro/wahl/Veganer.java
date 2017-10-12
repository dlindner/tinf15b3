package de.dhbw.tinf15b3.intro.wahl;

public class Veganer extends Partei {
	
	public Veganer() {
		super();
	}
	
	@Override
	public void gewonnen() {
		System.out.println("Veganer: Ich kann diese Urkunde leider nicht annehmen.");
	}
}
