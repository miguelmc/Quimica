package proyecto;

import java.util.ArrayList;
import java.util.HashSet;

public class Planta {
	
	private static HashSet<Maquina> maquinas;
	
	static{
		maquinas = new HashSet<Maquina>();
		ArrayList<String> productos;
		
		//Reactores-----------------------------------------------------------------------------------
		//TODO
		productos = new ArrayList<String>();
		productos.add("Paquete lubricante");
		maquinas.add(new Maquina("Reactor 1", productos));
		maquinas.add(new Maquina("Reactor 2", productos));
		maquinas.add(new Maquina("Reactor 3", productos));
		maquinas.add(new Maquina("Reactor 4", productos));
		maquinas.add(new Maquina("Reactor 5", productos));
		
		//Cribas---------------------------------------------------------------------------------------
		productos = new ArrayList<String>();
		productos.add("Blends");
		maquinas.add(new Maquina("Prensa", productos));
		
		//Criba 1 (no se)
		productos = new ArrayList<String>();
		productos.add("Estearato de potasio");
		maquinas.add(new Maquina("Criba 1", productos));
		
		//Criba 2 (PF-02)
		productos = new ArrayList<String>();
		productos.add("Estearato de calcio");
		maquinas.add(new Maquina("Criba 2", productos));
		
		//Criba 3 (criba paquetes)
		productos = new ArrayList<String>();
		productos.add("Paquete lubricante");
		maquinas.add(new Maquina("Criba 3", productos));
		
		//Criba 4 (criba zinc)
		productos = new ArrayList<String>();
		productos.add("Estearato de zinc");
		maquinas.add(new Maquina("Criba 4", productos));
		
		//Criba 5 (no se)
		maquinas.add(new Maquina("Criba 5", null));
		
		//Criba 6 (la de la mezc 1)
		productos = new ArrayList<String>();
		productos.add("Estearato de calcio");
		maquinas.add(new Maquina("Criba 6", productos));
		
		//Mezcladoras-----------------------------------------------------------------------------------
		productos = new ArrayList<String>();
		productos.add("Estearato de calcio");
		maquinas.add(new Maquina("Mezcladora 1", productos));
		
		productos = new ArrayList<String>();
		productos.add("Estearato de magnesio");
		productos.add("Estearato de sodio");
		maquinas.add(new Maquina("Mezcladora 2", productos));
		
		productos = new ArrayList<String>();
		productos.add("Estearato de magnesio");
		productos.add("Estearato de sodio");
		maquinas.add(new Maquina("Mezcladora 3", productos));
		
		productos = new ArrayList<String>();
		productos.add("Estearato de potasio");
		maquinas.add(new Maquina("Mezcladora 4", productos));
		
		productos = new ArrayList<String>();
		productos.add("Estearato de potasio");
		maquinas.add(new Maquina("Mezcladora 5", productos));
		
		//Molinos---------------------------------------------------------------------------------------
		
		//Molino 1
		productos = new ArrayList<String>();
		productos.add("Estearato de zinc");
		productos.add("Estearato de sodio");
		maquinas.add(new Maquina("Molino 1", productos));
		
		productos = new ArrayList<String>();
		productos.add("Estearato de magnesio");
		maquinas.add(new Maquina("Molino 3", productos));
		
		//Molino 2 y 4
		productos = new ArrayList<String>();
		productos.add("Estearato de calcio");
		maquinas.add(new Maquina("Molino 2 y 4", productos));
		
		maquinas.add(new Maquina("Molino 5", null));
		
		//Tolvas----------------------------------------------------------------------------------------
		maquinas.add(new Maquina("Tolva 1", null));
		maquinas.add(new Maquina("Tolva 2", null));
		maquinas.add(new Maquina("Tolva 3", null));
		
		//Rompeterrones---------------------------------------------------------------------------------
		maquinas.add(new Maquina("Rompeterrones 1", null));
		maquinas.add(new Maquina("Rompeterrones 2", null));
		
		//Tanques---------------------------------------------------------------------------------------
		
		productos = new ArrayList<String>();
		productos.add("Paquete lubricante");
		maquinas.add(new Maquina("Tanque cera", productos));
		
		maquinas.add(new Maquina("Tanque estearina", null));
		
		//Otros------------------------------------------------------------------------------------------
		
		//Pelletizador
		productos = new ArrayList<String>();
		productos.add("Paquete lubricante");
		maquinas.add(new Maquina("Pelletizador", productos));
		
	}
	 	
	public static Maquina getMaquinaPorNombre(String nombre){
		for(Maquina maquina : maquinas){
			if(nombre == maquina.getNombre())
				return maquina;
		}
		
		//TODO
		System.out.println(nombre + " no se encontro.");
		System.out.println(Thread.currentThread().getStackTrace()[2].getLineNumber());
		return null;
	}

	private Planta(){}
}
