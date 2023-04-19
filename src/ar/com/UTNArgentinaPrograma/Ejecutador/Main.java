package ar.com.UTNArgentinaPrograma.Ejecutador;

import ar.com.UTNArgentinaPrograma.Clases.Equipo;
import ar.com.UTNArgentinaPrograma.Clases.Partido;
import ar.com.UTNArgentinaPrograma.Clases.Persona;
import ar.com.UTNArgentinaPrograma.Clases.Pronostico;
import ar.com.UTNArgentinaPrograma.Clases.RESULTADO;
import ar.com.UTNArgentinaPrograma.Clases.Ronda;

public class Main {

	public static void main(String[] args) {
		
		/*INICIACION JUGADOR 1*/
		//DADA UNA PERSONA
		Persona jugador1 =dadoQueTengoUnaPersona("Leandro");
		//DADO UN PRONOSTICO
		Pronostico jugador1Pronostico = dadoQueTengoUnPronostico();
		//DADO UNA RONDA DEL PRONOSTICO
		Ronda jugador1RondaPronostico = dadoQueTengoUnaRonda();
		//DADO UN PARTIDO PRONOSTICO ARABIA SAUDITA VS ARGENTINA
		Partido jugador1PartidoPronosticoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
		Equipo jugador1EquipoPronosticoArabiaSaudita = new Equipo("Arabia Saudita");
		Equipo jugador1EquipoPronosticoArgentina = new Equipo("Argentina");
		//DADO UN PARTIDO DEL PRONOSTICO DE LA PERSONA POLONIA VS MEXICO
		Partido jugador1PartidoPronosticoMexicoVsPolonia = dadoQueTengoUnPartido();
		Equipo jugador1EquipoPronosticoPolonia = new Equipo("Polonia");
		Equipo jugador1EquipoPronosticoMexico = new Equipo("Mexico");
		
		cuandoUnaPersonaTieneUnPronostico(jugador1, jugador1Pronostico);
		cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(jugador1Pronostico,jugador1RondaPronostico);
		cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(jugador1RondaPronostico, jugador1PartidoPronosticoArabiaSauditaVsArgentina);
		cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(jugador1RondaPronostico,jugador1PartidoPronosticoMexicoVsPolonia);
		cuandoGuardoLosEquiposEnElPartido(jugador1PartidoPronosticoArabiaSauditaVsArgentina,jugador1EquipoPronosticoArabiaSaudita , jugador1EquipoPronosticoArgentina);
		cuandoGuardoLosEquiposEnElPartido(jugador1PartidoPronosticoMexicoVsPolonia,jugador1EquipoPronosticoMexico , jugador1EquipoPronosticoPolonia);
		cuandoLeAsignoUnResultadoElEquipo(jugador1PartidoPronosticoArabiaSauditaVsArgentina, jugador1EquipoPronosticoArabiaSaudita, RESULTADO.GANADOR);
		cuandoLeAsignoUnResultadoElEquipo(jugador1PartidoPronosticoMexicoVsPolonia, jugador1EquipoPronosticoMexico, RESULTADO.EMPATE);
		
		/*INICIACION JUGADOR 2*/
		//DADA UNA PERSONA
		Persona jugador2 =dadoQueTengoUnaPersona("Camila");
		//DADO UN PRONOSTICO
		Pronostico jugador2Pronostico = dadoQueTengoUnPronostico();
		//DADO UNA RONDA DEL PRONOSTICO
		Ronda jugador2RondaPronostico = dadoQueTengoUnaRonda();
		//DADO UN PARTIDO PRONOSTICO ARABIA SAUDITA VS ARGENTINA
		Partido jugador2PartidoPronosticoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
		Equipo jugador2EquipoPronosticoArabiaSaudita = new Equipo("Arabia Saudita");
		Equipo jugador2EquipoPronosticoArgentina = new Equipo("Argentina");
		//DADO UN PARTIDO DEL PRONOSTICO DE LA PERSONA POLONIA VS MEXICO
		Partido jugador2PartidoPronosticoMexicoVsPolonia = dadoQueTengoUnPartido();
		Equipo jugador2EquipoPronosticoPolonia = new Equipo("Polonia");
		Equipo jugador2EquipoPronosticoMexico = new Equipo("Mexico");
		
		cuandoUnaPersonaTieneUnPronostico(jugador2, jugador2Pronostico);
		cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(jugador2Pronostico,jugador2RondaPronostico);
		cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(jugador2RondaPronostico, jugador2PartidoPronosticoArabiaSauditaVsArgentina);
		cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(jugador2RondaPronostico,jugador2PartidoPronosticoMexicoVsPolonia);
		cuandoGuardoLosEquiposEnElPartido(jugador2PartidoPronosticoArabiaSauditaVsArgentina,jugador2EquipoPronosticoArabiaSaudita , jugador2EquipoPronosticoArgentina);
		cuandoGuardoLosEquiposEnElPartido(jugador2PartidoPronosticoMexicoVsPolonia,jugador2EquipoPronosticoMexico , jugador2EquipoPronosticoPolonia);
		cuandoLeAsignoUnResultadoElEquipo(jugador2PartidoPronosticoArabiaSauditaVsArgentina, jugador2EquipoPronosticoArabiaSaudita, RESULTADO.EMPATE);
		cuandoLeAsignoUnResultadoElEquipo(jugador2PartidoPronosticoMexicoVsPolonia, jugador2EquipoPronosticoMexico, RESULTADO.PERDEDOR);
		
		//INICIACION DE LOS PARTIDOS OFICIALES CON RESULTADO
		//DADO LA RONDA CON RESULTADOS
		Ronda rondaResultados = dadoQueTengoUnaRonda();
		//DADO EL PARTIDO CON RESULTADO DE ARABIA SAUDITA VS ARGENTINA
		Partido partidoResultadoArabiaSauditaVsArgentina = dadoQueTengoUnPartido();
		Equipo equipoResultadoArabiaSaudita = new Equipo("Arabia Saudita");
		Equipo equipoResultadoArgentina = new Equipo("Argentina");
		//DADO EL PARTIDO CON RESULTADO POLONIA VS MEXICO
		Partido partidoResultadoMexicoVsPolonia = dadoQueTengoUnPartido();
		Equipo equipoResultadoMexico = new Equipo("Mexico");
		Equipo equipoResultadoPolonia = new Equipo("Polonia");
		
		//CUANDO ORDENO EL PARTIDO CON RESULTADO DE ARABIA SAUDITA VS ARGENTINA
		cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(rondaResultados, partidoResultadoArabiaSauditaVsArgentina);
		cuandoGuardoLosEquiposEnElPartido(partidoResultadoArabiaSauditaVsArgentina,equipoResultadoArabiaSaudita , equipoResultadoArgentina);
		cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoArabiaSauditaVsArgentina, 2,1);
		cuandoLeAsignoUnResultadoElEquipo(partidoResultadoArabiaSauditaVsArgentina, equipoResultadoArabiaSaudita, RESULTADO.GANADOR);
		//CUANDO ORDENO EL PARTIDO CON RESULTADO DE POLONIA VS MEXICO
		cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(rondaResultados, partidoResultadoMexicoVsPolonia);
		cuandoGuardoLosEquiposEnElPartido(partidoResultadoMexicoVsPolonia,equipoResultadoMexico , equipoResultadoPolonia);
		cuandoUnPartidoLeOtorgoUnResultado(partidoResultadoMexicoVsPolonia, 0,0);
		cuandoLeAsignoUnResultadoElEquipo(partidoResultadoMexicoVsPolonia, equipoResultadoMexico, RESULTADO.EMPATE);
		
		//CUANDO ACTUALIZO EL PUNTAJE DEL JUGADOR 1
		cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(jugador1, jugador1PartidoPronosticoArabiaSauditaVsArgentina, partidoResultadoArabiaSauditaVsArgentina);
		cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(jugador1, jugador1PartidoPronosticoMexicoVsPolonia,partidoResultadoMexicoVsPolonia);

		//CUANDO ACTUALIZO EL PUNTAJE DEL JUGADOR 2
		cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(jugador2, jugador2PartidoPronosticoArabiaSauditaVsArgentina, partidoResultadoArabiaSauditaVsArgentina);
		cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(jugador2, jugador2PartidoPronosticoMexicoVsPolonia,partidoResultadoMexicoVsPolonia);
		
		System.out.println("----------------------------------");
		System.out.println("Bienvenidos al Pronostico Deportivo");
		System.out.println("Jugadores que participan: ");
		System.out.println("Jugador 1: "+jugador1.getNombre());
		System.out.println("Jugador 2: "+jugador2.getNombre());
		System.out.println("----------------------------------");
		
		System.out.println("Pronosticos del jugador 1: ");
		System.out.println("Partido Arabia Saudita vs Argentina: "+ jugador1EquipoPronosticoArabiaSaudita.getNombre()+" es: "+jugador1.getPronostico().getRondas().get(0).getPartidos().get(0).getResultadoEquipoUno());
		System.out.println("Partido Mexico vs Polonia: "+ jugador1EquipoPronosticoMexico.getNombre()+" es: "+ jugador1.getPronostico().getRondas().get(0).getPartidos().get(1).getResultadoEquipoUno());
		System.out.println("----------------------------------");
		System.out.println("Pronosticos del jugador 2: ");
		System.out.println("Partido Arabia Saudita vs Argentina: "+ jugador2EquipoPronosticoArabiaSaudita.getNombre()+" es: "+ jugador2.getPronostico().getRondas().get(0).getPartidos().get(0).getResultadoEquipoUno());
		System.out.println("Partido Mexico vs Polonia: "+ jugador2EquipoPronosticoMexico.getNombre()+" es: "+jugador2.getPronostico().getRondas().get(0).getPartidos().get(1).getResultadoEquipoUno());
		System.out.println("----------------------------------");
		
		System.out.println("Resultados de los partidos de la ronda: ");
		System.out.println("Partido: "+equipoResultadoArabiaSaudita.getNombre()+": "+partidoResultadoArabiaSauditaVsArgentina.getGolesEquipoUno()+" vs "+equipoResultadoArgentina.getNombre()+": "+partidoResultadoArabiaSauditaVsArgentina.getGolesEquipoDos());
		System.out.println("Partido: "+equipoResultadoMexico.getNombre()+": "+partidoResultadoMexicoVsPolonia.getGolesEquipoUno()+" vs "+equipoResultadoPolonia.getNombre()+": "+partidoResultadoMexicoVsPolonia.getGolesEquipoDos());
		System.out.println("----------------------------------");
		
		System.out.println("Puntaje de los jugadores: ");
		System.out.println("Jugador 1: "+ jugador1.getNombre()+"--Puntaje: "+ jugador1.getPuntaje());
		System.out.println("Jugador 2: "+ jugador2.getNombre()+"--Puntaje: "+ jugador2.getPuntaje());
	}
	
	private static void cuandoUnaPersonaTieneUnPronostico(Persona persona, Pronostico pronostico) {	
		persona.setPronostico(pronostico);	
	}
	
	private static void cuandoLaPersonaActualizaSuPuntajeEnBaseAlResultado(Persona persona,
			Partido partidoPronostico, Partido partidoResultado) {
		persona.actualizarPuntaje(partidoPronostico, partidoResultado);
		
	}
	
	private static void cuandoAgregoElPartidoEnLaPosicionUnoDeLaRonda(Ronda ronda, Partido partido) {
		ronda.getPartidos().add(1, partido);
		
	}
	
	private static void cuandoAgregoLaRondaEnLaPosicionCeroAlPronostico(Pronostico pronostico, Ronda ronda) {
		pronostico.agregarRonda(0,ronda);
	}
	
	private static void cuandoLeAsignoUnResultadoElEquipo(Partido partido,
			Equipo equipo, RESULTADO resultado) {
		partido.agregarResultado(equipo, resultado);
		
	}
	
	private static void cuandoUnPartidoLeOtorgoUnResultado(Partido partido, Integer golesEquipoUno, Integer golesEquipoDos) {
		partido.setGolesEquipoUno(golesEquipoUno);
		partido.setGolesEquipoDos(golesEquipoDos);	
	}
	
	private static void cuandoGuardoLosEquiposEnElPartido(Partido partido, Equipo equipo1, Equipo equipo2) {
		partido.agregarEquipos(equipo1,equipo2);
	}
	
	private static void cuandoAgregoElPartidoEnLaPosicionCeroDeLaRonda(Ronda ronda, Partido partidoArabiaSauditaVsArgentina) {
		ronda.getPartidos().add(0, partidoArabiaSauditaVsArgentina);
		
	}
	
	private static Persona dadoQueTengoUnaPersona(String nombre) {
		// TODO Auto-generated method stub
		return new Persona(nombre);
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
