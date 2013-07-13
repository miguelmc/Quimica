package proyecto;

import java.util.HashSet;

public class Producto {

	private String nombre;
	private HashSet<Proceso> procesos;
	
	public Producto(String nombre) {
		this.nombre = nombre;
	}
	
	public Producto(String nombre, HashSet<Proceso> procesos) {
		this.nombre = nombre;
		this.procesos = procesos;
	}

	public String getNombre() {
		return nombre;
	}

	public HashSet<Proceso> getProcesos() {
		return procesos;
	}


	
}
