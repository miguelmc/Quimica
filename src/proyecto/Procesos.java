package proyecto;

import java.util.HashSet;
import java.util.LinkedList;

public final class Procesos {
	
	private static HashSet<Proceso> procesos;
	private static Proceso temp;
	private static LinkedList<Maquina> pasos;
	
	static{
		procesos = new HashSet<Proceso>();
		
		//Estearato de sodio------------------------------------------------------------------------------------
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 2"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		//Estearato de magnesio---------------------------------------------------------------------------------
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 2"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 3"));
		temp = new Proceso("Estearato de magnesio", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 3"));
		temp = new Proceso("Estearato de magnesio", pasos);
		procesos.add(temp);
		
		
		//Estearato de zinc-------------------------------------------------------------------------------------
		//TODO: criba zinc?????????
		//NORMAL
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba Zinc"));
		temp = new Proceso("Estearato de zinc normal fino", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc normal fino", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba Zinc"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc normal grueso", pasos);
		procesos.add(temp);
		
		//ESPECIAL
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba Zinc"));
		temp = new Proceso("Estearato de zinc especial fino", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc especial fino", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba Zinc"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc especial grueso", pasos);
		procesos.add(temp);
		
		//Estearato de calcio ---------------------------------------------------------------------------------------
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Estearato de calcio PF-02", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Estearato de calcio PF-05", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio TEX", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio VVRT", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio TEX", pasos);
		procesos.add(temp);
		
		//Paquete lubricante (6 maneras) ----------------------------------------------------------------
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 2"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 3"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 4"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 2"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 3"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		
		pasos = new LinkedList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 4"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba paquetes"));
		temp = new Proceso("Paquete lubricante", pasos);
		procesos.add(temp);
		//----------------------------------------------------------------------------------------------
	}
	
	public void getMaquinasSiguientes(Maquina actual, String proceso){
		
	}
	
	private Procesos(){}

}
