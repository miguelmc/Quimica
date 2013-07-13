package proyecto;

import java.util.HashSet;

public class Planta {
	
	private static HashSet<Maquina> maquinas;
	
	static{
		maquinas = new HashSet<Maquina>();
		
		//Reactores
		maquinas.add(new Maquina("Reactor 1"));
		maquinas.add(new Maquina("Reactor 2"));
		maquinas.add(new Maquina("Reactor 3"));
		maquinas.add(new Maquina("Reactor 4"));
		maquinas.add(new Maquina("Reactor 5"));
		
		//Cribas
		maquinas.add(new Maquina("Criba 1"));
		maquinas.add(new Maquina("Criba 2"));
		maquinas.add(new Maquina("Criba 3"));
		maquinas.add(new Maquina("Criba 4"));
		maquinas.add(new Maquina("Criba 5"));
		maquinas.add(new Maquina("Criba 6"));
		
		//Mezcladoras
		maquinas.add(new Maquina("Mezcladora 1"));
		maquinas.add(new Maquina("Mezcladora 2"));
		maquinas.add(new Maquina("Mezcladora 3"));
		maquinas.add(new Maquina("Mezcladora 4"));
		maquinas.add(new Maquina("Mezcladora 5"));
		
		//Molinos
		maquinas.add(new Maquina("Molino 1"));
		maquinas.add(new Maquina("Molino 3"));
		maquinas.add(new Maquina("Molino 2 y 4"));
		maquinas.add(new Maquina("Molino 5"));
		
		//Tolvas
		maquinas.add(new Maquina("Tolva 1"));
		maquinas.add(new Maquina("Tolva 2"));
		maquinas.add(new Maquina("Tolva 3"));
		
		//Rompeterrones
		maquinas.add(new Maquina("Rompeterrones 1"));
		maquinas.add(new Maquina("Rompeterrones 2"));
		
		//Tanques
		maquinas.add(new Maquina("Tanque cera"));
		maquinas.add(new Maquina("Tanque estearina"));
		
		maquinas.add(new Maquina("Pelletizador"));
		maquinas.add(new Maquina("Criba paquetes"));
	}
	 	
	public static Maquina getMaquinaPorNombre(String nombre){
		for(Maquina maquina : maquinas){
			if(nombre == maquina.getNombre())
				return maquina;
		}
		
		//TODO
		System.out.println(nombre + " no se encontro.");
		System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
		System.exit(1);
		return null;
	}

	private Planta(){}
}
