package proyecto;

import java.util.ArrayList;
import java.util.LinkedList;

public class Proceso {
	private String producto, comentarios;
	private ArrayList<Maquina> pasos;
	
	public Proceso(String producto, ArrayList<Maquina> pasos){
		this.producto = producto;
		this.pasos = pasos;
		comentarios = "";
	}
	
	public Proceso(String producto, ArrayList<Maquina> pasos, String comentarios){
		this.producto = producto;
		this.pasos = pasos;
		this.comentarios = comentarios;
	}

	public String getProducto() {
		return producto;
	}
	
	public String getComentarios() {
		return comentarios;
	}

	public ArrayList<Maquina> getPasos() {
		return pasos;
	}
	
	public Maquina getSiguiente(Maquina actual){
		
		//Regresa la maquina si es que existe en la secuencia, si no regresa null
		for(int i=0; i<pasos.size()-1; ++i) {
			if(pasos.get(i).equals(actual))
				return pasos.get(i+1);
		}
		return null;
	}
	
}
