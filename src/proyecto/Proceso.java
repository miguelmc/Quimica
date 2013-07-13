package proyecto;

import java.util.LinkedList;

public class Proceso {
	private String producto;
	private LinkedList<Maquina> pasos;
	
	public Proceso(String producto, LinkedList<Maquina> pasos){
		this.producto = producto;
		this.pasos = pasos;
	}

	public String getProducto() {
		return producto;
	}

	public LinkedList<Maquina> getPasos() {
		return pasos;
	}
	
	
}
