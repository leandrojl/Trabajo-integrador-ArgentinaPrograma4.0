package ar.com.UTNArgentinaPrograma.Ejecutador;

import ar.com.UTNArgentinaPrograma.Clases.Equipo;
import ar.com.UTNArgentinaPrograma.Clases.Partido;
import ar.com.UTNArgentinaPrograma.Clases.Persona;
import ar.com.UTNArgentinaPrograma.Clases.Pronostico;
import ar.com.UTNArgentinaPrograma.Clases.Ronda;

public class Main {

	public static void main(String[] args) {
		
		//INICIACION DE LOS OBJETOS
		Persona jugador1 =dadoQueTengoUnaPersona("Leandro");
		Persona jugador2 =dadoQueTengoUnaPersona("Martina");
		Pronostico pronosticoJugador1 = dadoQueTengoUnPronostico();
		Pronostico pronosticoJugador2 = dadoQueTengoUnPronostico();
		Ronda primerRondaPronostico = dadoQueTengoUnaRonda();
		Partido partidoArabiaSauditaVsArgentinaPronostico = dadoQueTengoUnPartido();
		Partido partidoMexicoVsPoloniaPronostico = dadoQueTengoUnPartido();
		Equipo arabiaSaudia = new Equipo("Arabia Saudita");
		Equipo argentina = new Equipo("Argentina");
		Equipo mexico = new Equipo("Mexico");
		Equipo polonia = new Equipo("Polonia");
		
		System.out.println("Bienvenidos al Pronostico Deportivo");
		System.out.println("Los jugadores que participan: ");
		System.out.println(jugador1.getNombre());
		System.out.println(jugador2.getNombre());
		
		
		
		

	}
	
	private static Persona dadoQueTengoUnaPersona(String string) {
		// TODO Auto-generated method stub
		return new Persona(string);
	}

	private static Persona dadoQueTengoUnaPersona() {
		return new Persona();
	}
	
	private static Pronostico dadoQueTengoUnPronostico() {
		return new Pronostico();
	}
	
	private static Partido dadoQueTengoUnPartido() {
		return new Partido();
	}
	
	private static Ronda dadoQueTengoUnaRonda() {
		return new Ronda();
	}
}
