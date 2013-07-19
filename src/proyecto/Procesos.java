package proyecto;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;

public final class Procesos {
	
	private static HashSet<Proceso> procesos;
	private static Proceso temp;
	private static ArrayList<Maquina> pasos;
	
	static{
		procesos = new HashSet<Proceso>();
		
		//Estearato de sodio------------------------------------------------------------------------------------
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 2"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 4"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 5"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de sodio", pasos);
		procesos.add(temp);
		
		//Estearato de magnesio---------------------------------------------------------------------------------
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 2"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 3"));
		temp = new Proceso("Estearato de magnesio", pasos);
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 3"));
		temp = new Proceso("Estearato de magnesio", pasos);
		procesos.add(temp);
		
		
		//Estearato de zinc-------------------------------------------------------------------------------------
		//TODO: criba zinc?????????
		//NORMAL
		pasos = new ArrayList<Maquina>();
		//criba zinc????
		pasos.add(Planta.getMaquinaPorNombre("Criba 4"));
		temp = new Proceso("Estearato de zinc", pasos, "normal fino");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc", pasos, "normal grueso");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 4"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc", pasos, "normal grueso");
		procesos.add(temp);
		
		//ESPECIAL
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 4"));
		temp = new Proceso("Estearato de zinc", pasos, " especial fino");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc", pasos, "especial grueso");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Criba 4"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 1"));
		temp = new Proceso("Estearato de zinc", pasos, "especial grueso");
		procesos.add(temp);
		
		//Estearato de calcio ---------------------------------------------------------------------------------------
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 1"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Estearato de calcio", pasos, "PF-02");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 1"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Estearato de calcio", pasos, "PF-05");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 1"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio", pasos, "TEX");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 1"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio", pasos, "VVRT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Mezcladora 1"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 6"));
		pasos.add(Planta.getMaquinaPorNombre("Molino 2 y 4"));
		temp = new Proceso("Estearato de calcio", pasos, "TEX");
		procesos.add(temp);
		
		//Paquete lubricante (6 maneras) ----------------------------------------------------------------
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 2"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R1 -> R2 -> Criba + RT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 3"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R1 -> R3 -> Criba + RT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 1"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 4"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R1 -> R4 -> Criba + RT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 2"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R5 -> R2 -> Criba + RT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 3"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R5 -> R3 -> Criba + RT");
		procesos.add(temp);
		
		pasos = new ArrayList<Maquina>();
		pasos.add(Planta.getMaquinaPorNombre("Reactor 5"));
		pasos.add(Planta.getMaquinaPorNombre("Tanque cera"));
		pasos.add(Planta.getMaquinaPorNombre("Reactor 4"));
		pasos.add(Planta.getMaquinaPorNombre("Pelletizador"));
		pasos.add(Planta.getMaquinaPorNombre("Criba 3"));
		temp = new Proceso("Paquete lubricante", pasos, "R5 -> R4 -> Criba + RT");
		procesos.add(temp);
		//----------------------------------------------------------------------------------------------
	}
	
	//Regresa toda maquina que podría seguir de la maquina actual, de no haber ni una, 
	//regresa un arraylist vacio
	public static HashSet<String> getMaquinasSiguientes(Maquina actual){
		HashSet<String> maquinas = new HashSet<String>();
		Maquina temp;
		String nombre;
		
		for(Proceso proceso : procesos) {
			//evita procesos que no pertenecen al producto
			if(!proceso.getProducto().equalsIgnoreCase(actual.getProducto()))
				continue;
			
			temp = proceso.getSiguiente(actual);
			if(temp != null) {
				nombre = temp.getNombre();
				//if(!proceso.getComentarios().equals(""))
				//	nombre += " (" + proceso.getComentarios() + ")";
				maquinas.add(nombre);
			}
		}
		
		return maquinas;
	}
	
	public static ArrayList<Proceso> getProcesosDeMaquina(String maquina) {
		
		ArrayList<Proceso> procesosDeMaquina = new ArrayList<Proceso>();
		for(Proceso proceso : procesos){
			if(proceso.getProducto().equalsIgnoreCase(maquina))
				procesosDeMaquina.add(proceso);
		}
		return procesosDeMaquina;
	}
	
	//Evitar la instanciacion
	private Procesos(){}

}
