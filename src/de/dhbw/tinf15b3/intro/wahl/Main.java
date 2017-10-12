package de.dhbw.tinf15b3.intro.wahl;

import java.util.Arrays;
import java.util.List;

public final class Main {

	private Main() {
		super();
	}
	
	public static void main(String[] arguments) {
		final Piraten piris = new Piraten();
		final Veganer veggies = new Veganer();
		final List<Partei> parteien = Arrays.asList(
				piris,
				veggies);
		
		piris.gewonnen();
		veggies.gewonnen();
		for (Partei each : parteien) {
			each.gewonnen();
		}
//		parteien.forEach(Partei::gewonnen);

		final Wahlleiter g�nther = new Wahlleiter();
		g�nther.meldeAn0(piris);
		g�nther.meldeAn2(veggies);
		for (Partei each : parteien) {
			g�nther.meldeAn0(each);
		}
//		parteien.forEach(leiter::meldeAn);
	}
}
